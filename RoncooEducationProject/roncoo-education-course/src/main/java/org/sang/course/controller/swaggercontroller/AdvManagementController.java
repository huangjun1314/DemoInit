package org.sang.course.controller.swaggercontroller;

import com.alibaba.fastjson.JSONArray;
import io.swagger.annotations.*;
import org.sang.config.pojo.course.Adv;
import org.sang.course.service.AdvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/adv")
@Api(description = "广告管理")
public class AdvManagementController {

    @Autowired
    AdvService advService;

    @ApiOperation(value = "分页查询广告信息",notes = "分页查询广告信息")
    @RequestMapping(value = "/selAdvAlOL",produces = "application/json",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="第几页",dataType="int", paramType = "query",defaultValue = "0"),
            @ApiImplicitParam(name="limit",value="每页显示多少条数据",dataType="int", paramType = "query",defaultValue = "100")})
    public Object selAdvAlOL(@RequestParam int offset, @RequestParam int limit){
        List<Adv> advList = new ArrayList<>();
        try {
            advList = advService.queryAllByLimit(offset,limit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(advList);
        return jsonString;
    }

    @ApiOperation(value = "修改广告信息", notes = "修改广告信息")
    @RequestMapping(value="/modifyAdv",method=RequestMethod.POST)
    public Object modifyAdv(
            @ApiParam(name="adv",value="广告信息",required=true)
            @RequestBody Adv adv){
        Adv adv1 = new Adv();
        try {
            adv1 = advService.update(adv);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return adv1;
    }

    @ApiOperation(value = "新增广告信息", notes = "新增广告信息")
    @RequestMapping(value="/insertAdv",method=RequestMethod.POST)
    public Object insertAdv(
            @ApiParam(name="adv",value="广告信息",required=true)
            @RequestBody Adv adv){
        Adv adv1 = new Adv();
        try {
            adv1 = advService.insert(adv);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return adv1;
    }
}
