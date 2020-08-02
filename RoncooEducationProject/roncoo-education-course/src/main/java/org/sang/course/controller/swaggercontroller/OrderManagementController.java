package org.sang.course.controller.swaggercontroller;

import io.swagger.annotations.*;
import com.alibaba.fastjson.JSONArray;
import org.sang.config.pojo.course.OrderPay;
import org.sang.course.service.OrderInfoService;
import org.sang.course.service.OrderPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.sang.config.pojo.course.OrderInfo;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
@Api(description = "订单管理")
public class OrderManagementController {

    @Autowired
    OrderInfoService orderInfoService;

    @Autowired
    OrderPayService orderPayService;

    @ApiOperation(value = "根据ID查询订单列表",notes = "根据ID查询订单列表")
    @RequestMapping(value = "/selOrderInfoById",produces = "application/json",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="ID",dataType="Long", paramType = "query",defaultValue = "1087188861599453186")})
    public Object selOrderInfoById(@RequestParam Long id){
        OrderInfo orderInfo = new OrderInfo();
        try {
            orderInfo = orderInfoService.queryById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<OrderInfo> orderInfoList = new ArrayList<>();
        orderInfoList.add(orderInfo);
        return JSONArray.toJSONString(orderInfoList);
    }

    @ApiOperation(value = "分页查询订单列表",notes = "分页查询订单列表")
    @RequestMapping(value = "/selOrderInfoAllOL",produces = "application/json",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="第几页",dataType="int", paramType = "query",defaultValue = "0"),
            @ApiImplicitParam(name="limit",value="每页显示多少条数据",dataType="int", paramType = "query",defaultValue = "100")})
    public Object selOrderInfoAllOL(@RequestParam int offset, @RequestParam int limit){
        List<OrderInfo> orderInfoList = new ArrayList<>();
        try {
            orderInfoList = orderInfoService.queryAllByLimit(offset,limit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(orderInfoList);
        return jsonString;
    }

    @ApiOperation(value = "多条件查询订单列表", notes = "多条件查询订单列表")
    @RequestMapping(value="/queryAllOrderInfoConditions",method=RequestMethod.POST)
    public Object queryAllOrderInfoConditions(
            @ApiParam(name="orderInfo",value="订单列表信息",required=true)
            @RequestBody OrderInfo orderInfo){
        List<OrderInfo> orderInfoList = new ArrayList<>();
        try {
            orderInfoList = orderInfoService.queryAll(orderInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(orderInfoList);
        return jsonString;
    }

    @ApiOperation(value = "新增订单信息", notes = "新增订单信息")
    @RequestMapping(value="/insertOrderInfo",method=RequestMethod.POST)
    public Object insertOrderInfo(
            @ApiParam(name="orderInfo",value="订单信息",required=true)
            @RequestBody OrderInfo orderInfo){
        OrderInfo orderInfo1 = new OrderInfo();
        try {
            orderInfo1 = orderInfoService.insert(orderInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orderInfo1.toString();
    }

    @ApiOperation(value = "修改订单信息", notes = "修改订单信息")
    @RequestMapping(value="/updateOrderInfo",method=RequestMethod.POST)
    public Object updateOrderInfo(
            @ApiParam(name="orderInfo",value="订单信息",required=true)
            @RequestBody OrderInfo orderInfo){
        OrderInfo orderInfo1 = new OrderInfo();
        try {
            orderInfo1 = orderInfoService.update(orderInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orderInfo1.toString();
    }

    @ApiOperation(value = "删除订单列表",notes = "删除订单列表")
    @RequestMapping(value = "/delOrderInfoById",produces = "application/json",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="ID",dataType="Long", paramType = "query",defaultValue = "1087188861599453186")})
    public Object delOrderInfoById(@RequestParam Long id){
        Boolean flag = false;
        try {
            flag = orderInfoService.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @ApiOperation(value = "根据ID查询订单支付列表",notes = "根据ID查询订单支付列表")
    @RequestMapping(value = "/selOrderPayById",produces = "application/json",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="ID",dataType="Long", paramType = "query",defaultValue = "1087188862429925378")})
    public Object selOrderPayById(@RequestParam Long id){
        OrderPay orderPay = new OrderPay();
        try {
            orderPay = orderPayService.queryById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<OrderPay> orderPayList = new ArrayList<>();
        orderPayList.add(orderPay);
        return JSONArray.toJSONString(orderPayList);
    }

    @ApiOperation(value = "分页查询订单支付列表",notes = "分页查询订单支付列表")
    @RequestMapping(value = "/selOrderPayAllOL",produces = "application/json",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="第几页",dataType="int", paramType = "query",defaultValue = "0"),
            @ApiImplicitParam(name="limit",value="每页显示多少条数据",dataType="int", paramType = "query",defaultValue = "100")})
    public Object selOrderPayAllOL(@RequestParam int offset, @RequestParam int limit){
        List<OrderPay> orderPayList = new ArrayList<>();
        try {
            orderPayList = orderPayService.queryAllByLimit(offset,limit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(orderPayList);
        return jsonString;
    }

    @ApiOperation(value = "新增订单支付信息", notes = "新增订单信息")
    @RequestMapping(value="/insertOrderPay",method=RequestMethod.POST)
    public Object insertOrderPay(
            @ApiParam(name="orderPay",value="订单信息",required=true)
            @RequestBody OrderPay orderPay){
        OrderPay orderPay1 = new OrderPay();
        try {
            orderPay1 = orderPayService.insert(orderPay);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orderPay1.toString();
    }

    @ApiOperation(value = "修改订单支付信息", notes = "修改订单支付信息")
    @RequestMapping(value="/updateOrderPay",method=RequestMethod.POST)
    public Object updateOrderPay(
            @ApiParam(name="orderPay",value="订单信息",required=true)
            @RequestBody OrderPay orderPay){
        OrderPay orderPay1 = new OrderPay();
        try {
            orderPay1 = orderPayService.update(orderPay);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orderPay1.toString();
    }

    @ApiOperation(value = "删除订单支付列表",notes = "删除订单支付列表")
    @RequestMapping(value = "/delOrderPayById",produces = "application/json",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="ID",dataType="Long", paramType = "query",defaultValue = "1087188861599453186")})
    public Object delOrderPayById(@RequestParam Long id){
        Boolean flag = false;
        try {
            flag = orderPayService.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

}
