package org.sang.trade.controller;

import org.sang.config.pojo.course.OrderInfo;
import org.sang.trade.config.WxRequestParam;
import org.sang.trade.service.OrderService;
import org.sang.trade.utils.WxPayUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class WxPayController {
    @Resource
    private OrderService orderService;
    @Resource
    private WxPayUtil wxPayUtil;
    //订单确认
    @ApiOperation(value = "微信支付")
    @GetMapping(value = "/user/wxPayController/prepay/{orderNo}/")
    public ModelAndView prePay(@PathVariable @ApiParam(name = "orderNo",value = "订单编号") String orderNo, ModelMap model) {
        ModelAndView mv = new ModelAndView();
        try {
            mv.setViewName("wxpay");
            OrderInfo orderInfo = orderService.loadOrderInfo(orderNo);
            if (orderInfo != null) {
                mv.addObject("orderNo", orderInfo.getOrderNo());
                mv.addObject("courseName", orderInfo.getCourseName());
                mv.addObject("pricePayable", orderInfo.getPricePayable());
                mv.addObject("priceDiscount", orderInfo.getPriceDiscount());
                mv.addObject("pricePaid", orderInfo.getPricePaid());
                mv.addObject("remark",orderInfo.getRemark());
            }
        } catch (Exception e) {
            e.printStackTrace();
            mv.setViewName("error");
        }
       return mv;
    }


    @PostMapping(value = "/user/wxPayController/pay", produces = "application/json")
    @ResponseBody
    public String pay(String body, String money, String orderNo, HttpSession session) {
        WxRequestParam param = new WxRequestParam();
        param.setBody(body);
        param.setTotal_fee("0.01");
        param.setOut_trade_no(orderNo);
        session.setAttribute("orderNo", param.getOut_trade_no());

        String codeUrl= WxPayUtil.getCodeUrl(param);

        System.out.println(codeUrl);
        //return DtoUtil.returnSuccess("chne",codeUrl);
        return codeUrl;
    }


    @PostMapping("/user/wxPayController/query")
    @ResponseBody
    public Object queryOrderState(HttpSession session) throws Exception {
        String orderId=(String) session.getAttribute("orderNo");
        WxRequestParam param = new WxRequestParam();
        param.setOut_trade_no(orderId);
        boolean result=wxPayUtil.queryOrderState(param);
        return result;
    }


    @GetMapping("/user/wxPayController/success")
    public ModelAndView success() throws Exception {
        return new ModelAndView("success");
    }

    @GetMapping("/user/wxPayController/fail")
    public ModelAndView fail () throws Exception {
        return new ModelAndView("fail");
    }




}
