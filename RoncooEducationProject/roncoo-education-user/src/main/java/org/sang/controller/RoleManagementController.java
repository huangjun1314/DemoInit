package org.sang.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import com.alibaba.fastjson.JSONArray;
import org.sang.entity.SysRole;
import org.sang.service.RoleManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(value = "角色管理",description = "角色管理")
public class RoleManagementController {

    @Autowired
    RoleManagementService roleManagementService;

    /**
     * 查询全部角色
     * @return
     */
    @ApiOperation(value = "查询全部",notes = "查询全部")
    @RequestMapping(value = "/getAllRole",produces = "application/json",method = RequestMethod.GET)
    public Object getAllRole(){
        List<SysRole> roleList = new ArrayList<>();
        try {
            roleList = roleManagementService.getAllRole();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = JSONArray.toJSONString(roleList);
        return jsonString;
    }

    /**
     * 新增角色
     * @param roleName
     * @param remark
     * @return
     */
    @ApiOperation(value = "新增角色",notes = "新增角色")
    @RequestMapping(value = "/insertRole",produces = {"application/json;text/html;charset=utf-8"},method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name="roleName",value="名称",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="remark",value="备注",dataType="long", paramType = "query")})
    public Object insertRole(@RequestParam String roleName,@RequestParam String remark){
        int num = 0;
        try {
            num = roleManagementService.insertRole(roleName,remark);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }

    /**
     * 修改
     * @param roleName
     * @param sort
     * @param remark
     * @param statusId
     * @param id
     * @return
     */
    @ApiOperation(value = "修改",notes = "修改")
    @RequestMapping(value = "/updateRole",produces = "application/json",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name="roleName",value="名称",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="sort",value="排序",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="remark",value="备注",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="statusId",value="状态",dataType="string", paramType = "query"),
            @ApiImplicitParam(name="id",value="ID",dataType="string", paramType = "query")})
    public Object updateRole(@RequestParam String roleName, @RequestParam String sort, @RequestParam  String remark
                                , @RequestParam  String statusId, @RequestParam  String id){
        int num = 0;
        try {
            num = roleManagementService.updateRole(roleName,sort,remark,statusId,id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }

    /**
     * 根据角色ID删除角色
     * @param id
     * @return
     */
    @ApiOperation(value = "根据角色ID删除角色",notes = "根据角色ID删除角色")
    @ApiImplicitParam(paramType = "query",required = true,value = "角色ID",name = "id")
    @RequestMapping(value = "/delRoleById",produces = "application/json",method = RequestMethod.POST)
    public Object delRoleById(@RequestParam String id){
        int num = 0;
        try {
            num = roleManagementService.delRoleById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }

    /**
     * 设置权限
     * @param menuId
     * @param roleId
     * @return
     */
    @ApiOperation(value = "设置权限",notes = "设置权限")
    @ApiImplicitParams({
            @ApiImplicitParam(name="menuId",value="权限",dataType="List<String>", paramType = "query"),
            @ApiImplicitParam(name="roleId",value="角色ID",dataType="string", paramType = "query")})
    @RequestMapping(value = "/insetSetThePpermissions",produces = "application/json",method = RequestMethod.POST)
    public Object insetSetThePpermissions(@RequestParam String menuId,@RequestParam String roleId){
        int num = 0;
        try {
            List<String> menuIds = new ArrayList<>();
            String[] sum = menuId.split(",");
            for (int i=0; i<sum.length; i++){
                menuIds.add(sum[i]);
            }
            num = roleManagementService.insetSetThePpermissions(menuIds,roleId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }
}
