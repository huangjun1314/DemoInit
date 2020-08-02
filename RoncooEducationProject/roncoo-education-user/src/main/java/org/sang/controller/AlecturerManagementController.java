package org.sang.controller;

import io.swagger.annotations.*;
import com.alibaba.fastjson.JSONArray;
import org.sang.config.pojo.Shunt;
import org.sang.config.pojo.user.Lecturer;
import org.sang.config.pojo.user.LecturerAudit;
import org.sang.service.AlecturerManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/lecturer")
@Api(description = "讲师管理")
public class AlecturerManagementController {

    @Autowired
    AlecturerManagementService alecturerManagementService;

    @ApiOperation(value = "查询全部讲师信息",notes = "查询全部讲师信息")
    @RequestMapping(value = "/selLecurerAll",produces = "application/json",method = RequestMethod.GET)
    public Object selLecurerAll(){
        List<Lecturer> lecturerList = new ArrayList<>();
        try {
            lecturerList = alecturerManagementService.getAllLecturerByNMS(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(lecturerList);
        return jsonString;
    }

    @ApiOperation(value = "修改讲师", notes = "修改讲师")
    @RequestMapping(value="/modifyLecturer",method=RequestMethod.POST)
    public Object modifyLecturer(
            @ApiParam(name="lecturer",value="讲师信息",required=true)
            @RequestBody Lecturer lecturer){
        int num = 0;
        try {
            num = alecturerManagementService.updateLecturer(lecturer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }

    @ApiOperation(value = "设置讲师分成", notes = "设置讲师分成")
    @RequestMapping(value="/modifyLecturerByLecturerProportion",method=RequestMethod.POST)
    public Object modifyLecturerByLecturerProportion(
            @ApiParam(name="lecturerProportion",value="分成",required=true) String lecturerProportion,
            @ApiParam(name="id",value="ID",required=true) String id){
        int num = 0;
        try {
            Lecturer lecturer = new Lecturer();
            lecturer.setId(Long.valueOf(id));
            lecturer.setLecturerProportion(Double.valueOf(lecturerProportion));

            num = alecturerManagementService.updateLecturer(lecturer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }

    @ApiOperation(value = "查询全部讲师信息-审核",notes = "查询全部讲师信息-审核")
    @RequestMapping(value = "/selLecurerAuditAll",produces = "application/json",method = RequestMethod.GET)
    public Object selLecurerAuditAll(){
        List<LecturerAudit> lecturerAuditList = new ArrayList<>();
        try {
            lecturerAuditList = alecturerManagementService.selLeturerAuditByI(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(lecturerAuditList);
        return jsonString;
    }

    @ApiOperation(value = "修改与审核讲师-审核", notes = "修改与审核讲师-审核")
    @RequestMapping(value="/modifyLecturerAudit",method=RequestMethod.POST)
    public Object modifyLecturerAudit(
            @ApiParam(name="lecturerAudit",value="讲师信息",required=true)
            @RequestBody LecturerAudit lecturerAudit){
        int num = 0;
        try {
            num = alecturerManagementService.updateLecturerAudit(lecturerAudit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }

    @ApiOperation(value = "添加讲师-审核", notes = "添加讲师-审核")
    @RequestMapping(value="/insertLecturerAudit",method=RequestMethod.POST)
    public Object insertLecturerAudit(
            @ApiParam(name="lecturerAudit",value="讲师信息",required=true)
            @RequestBody LecturerAudit lecturerAudit){
        int num = 0;
        try {
            num = alecturerManagementService.insertLecturerAudit(lecturerAudit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }

    @ApiOperation(value = "查询分润列表",notes = "查询分润列表")
    @RequestMapping(value = "/selAListOfQueries",produces = "application/json",method = RequestMethod.GET)
    public Object selAListOfQueries(){
        List<Shunt> shuntArrayList = new ArrayList<>();
        try {
            shuntArrayList = alecturerManagementService.AListOfQueries(null,null,null,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(shuntArrayList);
        return jsonString;
    }

    @ApiOperation(value = "多条件查询分润列表",notes = "多条件查询分润列表")
    @RequestMapping(value = "/selAListOfQueriesByLPTT",produces = "application/json",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name="lecturerName",value="讲师名称",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="profitStatus",value="分润状态",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="theStartTime",value="开始日期",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="theEndOfTime",value="结束日期",dataType="string", paramType = "query")})
    public Object selAListOfQueriesByLPTT(@RequestParam String lecturerName
            ,@RequestParam String profitStatus, @RequestParam String theStartTime, @RequestParam String theEndOfTime){
        List<Shunt> shuntArrayList = new ArrayList<>();
        try {
            shuntArrayList = alecturerManagementService.AListOfQueries(lecturerName,profitStatus,theStartTime,theEndOfTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(shuntArrayList);
        return jsonString;
    }

}
