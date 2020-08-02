package org.sang.course.controller.swaggercontroller;

import com.alibaba.fastjson.JSONArray;
import io.swagger.annotations.*;
import org.sang.config.pojo.course.Zone;
import org.sang.config.pojo.course.ZoneCourse;
import org.sang.course.service.ZoneCourseService;
import org.sang.course.service.ZoneService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/home")
@Api(description = "专区管理")
public class HomeManagementController {

    @Resource
    private ZoneService zoneService;

    @Resource
    private ZoneCourseService zoneCourseService;

    @ApiOperation(value = "分页查询专区信息",notes = "分页查询专区信息")
    @RequestMapping(value = "/selZoneAlOL",produces = "application/json",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="第几页",dataType="int", paramType = "query",defaultValue = "0"),
            @ApiImplicitParam(name="limit",value="每页显示多少条数据",dataType="int", paramType = "query",defaultValue = "100")})
    public Object selZoneAlOL(@RequestParam int offset, @RequestParam int limit){
        List<Zone> zoneList = new ArrayList<>();
        try {
            zoneList = zoneService.queryAllByLimit(offset,limit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(zoneList);
        return jsonString;
    }

    @ApiOperation(value = "多条件查询专区信息列表", notes = "多条件查询专区信息列表")
    @RequestMapping(value="/queryAllZoneConditions",method=RequestMethod.POST)
    public Object queryAllZoneConditions(
            @ApiParam(name="zone",value="专区信息",required=true)
            @RequestBody Zone zone){
        List<Zone> zoneList = new ArrayList<>();
        try {
            zoneList = zoneService.queryAll(zone);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(zoneList);
        return jsonString;
    }

    @ApiOperation(value = "修改专区信息", notes = "修改专区信息")
    @RequestMapping(value="/modifyZone",method=RequestMethod.POST)
    public Object modifyZone(
            @ApiParam(name="zone",value="专区信息",required=true)
            @RequestBody Zone zone){
        Zone zone1 = new Zone();
        try {
            zone1 = zoneService.update(zone);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return zone1;
    }

    @ApiOperation(value = "新增专区信息", notes = "修改专区信息")
    @RequestMapping(value="/insertZone",method=RequestMethod.POST)
    public Object insertZone(
            @ApiParam(name="zone",value="专区信息",required=true)
            @RequestBody Zone zone){
        Zone zone1 = new Zone();
        try {
            zone1 = zoneService.insert(zone);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return zone1;
    }

    @ApiOperation(value = "根据ID删除专区",notes = "根据ID删除专区")
    @ApiImplicitParam(paramType = "query",required = true,value = "ID",name = "id")
    @RequestMapping(value = "/delZoneById",produces = "application/json",method = RequestMethod.POST)
    public Object delZoneById(@RequestParam String id){
        Boolean flag = false;
        try {
            flag = zoneService.deleteById(Long.valueOf(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @ApiOperation(value = "分页查询专区课程信息",notes = "分页查询专区课程信息")
    @RequestMapping(value = "/selZoneCourseAlOL",produces = "application/json",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="第几页",dataType="int", paramType = "query",defaultValue = "0"),
            @ApiImplicitParam(name="limit",value="每页显示多少条数据",dataType="int", paramType = "query",defaultValue = "100")})
    public Object selZoneCourseAlOL(@RequestParam int offset, @RequestParam int limit){
        List<ZoneCourse> zoneCourseList = new ArrayList<>();
        try {
            zoneCourseList = zoneCourseService.queryAllByLimit(offset,limit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(zoneCourseList);
        return jsonString;
    }

    @ApiOperation(value = "多条件查询专区课程信息列表", notes = "多条件查询专区课程信息列表")
    @RequestMapping(value="/queryAllZoneCourseConditions",method=RequestMethod.POST)
    public Object queryAllZoneCourseConditions(
            @ApiParam(name="zoneCourse",value="专区信息",required=true)
            @RequestBody ZoneCourse zoneCourse){
        List<ZoneCourse> zoneCourseList = new ArrayList<>();
        try {
            zoneCourseList = zoneCourseService.queryAll(zoneCourse);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(zoneCourseList);
        return jsonString;
    }

    @ApiOperation(value = "新增专区课程信息", notes = "新增专区课程信息")
    @RequestMapping(value="/insertZoneCourse",method=RequestMethod.POST)
    public Object insertZoneCourse(
            @ApiParam(name="zoneCourse",value="专区课程信息",required=true)
            @RequestBody ZoneCourse zoneCourse){
        ZoneCourse zoneCourse1 = new ZoneCourse();
        try {
            zoneCourse1 = zoneCourseService.insert(zoneCourse);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return zoneCourse1;
    }

    @ApiOperation(value = "修改专区课程信息", notes = "修改专区课程信息")
    @RequestMapping(value="/updateZoneCourse",method=RequestMethod.POST)
    public Object updateZoneCourse(
            @ApiParam(name="zoneCourse",value="专区课程信息",required=true)
            @RequestBody ZoneCourse zoneCourse){
        ZoneCourse zoneCourse1 = new ZoneCourse();
        try {
            zoneCourse1 = zoneCourseService.update(zoneCourse);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return zoneCourse1;
    }

    @ApiOperation(value = "根据ID删除专区课程",notes = "根据ID删除专区课程")
    @ApiImplicitParam(paramType = "query",required = true,value = "ID",name = "id")
    @RequestMapping(value = "/delZoneCourseById",produces = "application/json",method = RequestMethod.POST)
    public Object delZoneCourseById(@RequestParam String id){
        Boolean flag = false;
        try {
            flag = zoneCourseService.deleteById(Long.valueOf(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

}
