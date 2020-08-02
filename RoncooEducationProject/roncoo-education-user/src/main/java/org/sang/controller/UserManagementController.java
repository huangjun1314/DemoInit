package org.sang.controller;

import io.swagger.annotations.*;
import com.alibaba.fastjson.JSONArray;
import org.sang.bc.BC;
import org.sang.entity.SysUser;
import org.sang.entity.User;
import org.sang.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@Api(value = "用户管理",description = "用户管理")
public class UserManagementController {

    @Autowired
    private UserManagementService userManagementService;

    /**
     * 查询后台用户信息
     * @return
     */
    @ApiOperation(value = "查询后台用户信息",notes = "查询后台用户信息")
    @RequestMapping(value = "/userManagementSysUserList",produces = "application/json",method = RequestMethod.GET)
    public Object userManagementSysUserList(){
        List<SysUser> sysUserList = new ArrayList<>();
        try {
            sysUserList = userManagementService.getAllSysUserASByMobile(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(sysUserList);
        return jsonString;
    }

    /**
     * 根据手机号直接查询后台用户信息
     * @param mobile
     * @return
     */
    @ApiOperation(value = "根据手机号直接查询后台用户信息",notes = "根据手机号直接查询后台用户信息")
    @ApiImplicitParam(paramType = "path",required = true,value = "手机号",name = "mobile")
    @RequestMapping(value = "/userManagementSysUserListByMobile/{mobile}",produces = "application/json",method = RequestMethod.POST)
    public Object userManagementSysUserListByMobile(@PathVariable String mobile){
        List<SysUser> sysUserList = new ArrayList<>();
        try {
            sysUserList = userManagementService.getAllSysUserASByMobile(mobile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(sysUserList);
        return jsonString;
    }

    /**
     * 根据手机号修改后台用户
     * @param realName
     * @param sort
     * @param remark
     * @param mobile
     * @return
     */
    @ApiOperation(value = "根据手机号修改后台用户",notes = "根据手机号修改后台用户")
    @RequestMapping(value = "/userManagementSysUserModify",produces = "application/json",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name="realName",value="真实姓名",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="sort",value="排序",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="remark",value="备注",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="mobile",value="手机号",dataType="long", paramType = "query")})
    public Object userManagementSysUserModify(@RequestParam String realName
        ,@RequestParam int sort, @RequestParam String remark, @RequestParam String mobile){
        int num = 0;
        try {
            num = userManagementService.modifySysUser(realName,sort,remark,mobile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }

    /**
     * 新增用户
     * @param mobile
     * @param realName
     * @param remark
     * @return
     */
    @ApiOperation(value = "新增后台用户",notes = "新增后台用户")
    @RequestMapping(value = "/userManagementInsertSysUserAndUser",produces = {"application/json;text/html;charset=utf-8"},method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name="mobile",value="手机号",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="realName",value="真实姓名",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="remark",value="备注",dataType="long", paramType = "query")})
    public Object userManagementInsertSysUserAndUser(@RequestParam String mobile
            ,@RequestParam String realName
            ,@RequestParam String remark){
        int num = 0;
        try {
            num = userManagementService.insertSysUserAndUser(mobile,realName,remark);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }

    /**
     * 根据手机号删除后台用户
     * @param mobile
     * @return
     */
    @ApiOperation(value = "根据手机号删除后台用户",notes = "根据手机号删除后台用户")
    @ApiImplicitParam(paramType = "query",required = true,value = "手机号",name = "mobile")
    @RequestMapping(value = "/delSysUserByMobile",produces = "application/json",method = RequestMethod.POST)
    public Object delSysUserByMobile(@RequestParam String mobile){
        int num = 0;
        try {
            num = userManagementService.delSysUserByMobile(mobile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }

    /**
     * 修改密码
     * @param ymobilePsw 旧密码
     * @param mobilePsw 新密码
     * @param mobile 手机号
     * @return
     */
    @ApiOperation(value = "修改密码",notes = "修改密码")
    @RequestMapping(value = "/modifyUserByMobile",produces = "application/json",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name="ymobilePsw",value="原密码",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="mobilePsw",value="新密码",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="mobile",value="手机号",dataType="long", paramType = "query")})
    @ResponseBody
    public Object modifyUserByMobile(@RequestParam String ymobilePsw, @RequestParam String mobilePsw, @RequestParam  String mobile){
        int num = 0;
        try {
            User user = userManagementService.loadUserByUsername(mobile);
            if (null == user){
                return "该手机号的用户不存在";
            }else if (!BC.bcEncoderDB(ymobilePsw,user.getPassword())){
                return "新旧密码不一致";
            }
            num = userManagementService.modifyUserByMobile(BC.bcEncoder(mobilePsw),mobile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }

}
