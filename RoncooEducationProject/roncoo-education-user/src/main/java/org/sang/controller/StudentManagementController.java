package org.sang.controller;

import io.swagger.annotations.*;
import com.alibaba.fastjson.JSONArray;
import org.sang.config.pojo.user.UserExt;
import org.sang.service.StudentManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
@Api(description = "学员管理")
public class StudentManagementController {

    @Autowired
    StudentManagementService studentManagementService;

    @ApiOperation(value = "查询全部学员信息",notes = "查询全部学员信息")
    @RequestMapping(value = "/selStudentAll",produces = "application/json",method = RequestMethod.GET)
    public Object selStudentAll(){
        List<UserExt> userExtArrayList = new ArrayList<>();
        try {
            userExtArrayList = studentManagementService.selUserExtMapBI(null,null,null,null,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(userExtArrayList);
        return jsonString;
    }

    @ApiOperation(value = "多条件查询分润列表",notes = "多条件查询分润列表")
    @RequestMapping(value = "/selAListOfQueriesByLPTT",produces = "application/json",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name="mobile",value="用户手机",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="nickname",value="昵称",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="statusId",value="状态",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="theStartTime",value="注册开始时间",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="theEndOfTime",value="注册结束时间",dataType="string", paramType = "query")})
    public Object selAListOfQueriesByLPTT(@RequestParam String mobile
            ,@RequestParam String nickname, @RequestParam String statusId, @RequestParam String theStartTime, @RequestParam String theEndOfTime){
        List<UserExt> userExtArrayList = new ArrayList<>();
        try {
            userExtArrayList = studentManagementService.selUserExtMapBI(mobile,nickname,statusId,theStartTime,theEndOfTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(userExtArrayList);
        return jsonString;
    }

    @ApiOperation(value = "修改与改变状态-学员列表", notes = "修改与改变状态-学员列表")
    @RequestMapping(value="/modifyUserExt",method=RequestMethod.POST)
    public Object modifyLecturerAudit(
            @ApiParam(name="userExt",value="讲师信息",required=true)
            @RequestBody UserExt userExt){
        int num = 0;
        try {
            num = studentManagementService.updateUserExt(userExt);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }
}
