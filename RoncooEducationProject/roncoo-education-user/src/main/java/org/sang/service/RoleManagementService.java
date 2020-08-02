package org.sang.service;

import org.apache.ibatis.annotations.Param;
import org.sang.entity.SysRole;
import org.sang.mapper1.sysmenu.SysMenuMapper;
import org.sang.mapper1.sysrole.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleManagementService {

    @Autowired
    SysMenuMapper sysMenuMapper;

    @Autowired
    SysRoleMapper sysRoleMapper;

    public List<SysRole> getAllRole() throws Exception{
        List<SysRole> roleList = sysRoleMapper.getAllRole();
        if (roleList != null){
            return roleList;
        }
        return null;
    }

    public int insertRole(@Param("roleName") String roleName ,@Param("remark") String remark){
        return sysRoleMapper.insertRole(roleName,remark);
    }

    public int updateRole(@Param("roleName") String roleName, @Param("sort") String sort
            ,@Param("remark") String remark, @Param("statusId") String statusId, @Param("id") String id){
        return sysRoleMapper.updateRole(roleName,sort,remark,statusId,id);
    }

    public int delRoleById(@Param("id") String id){
        try{
            int num = 0;
            num += sysMenuMapper.delByRoleId(id);
            num += sysRoleMapper.delRoleById(id);
            return num;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    public int insetSetThePpermissions(@Param("menuId") List<String> menuId,@Param("roleId") String roleId){
        try{
            int num = menuId.size();
            int sum = 0;
            for (String mi:menuId) {
                sum += sysMenuMapper.insetSetThePpermissions(mi,roleId);
            }
            if (num == sum){
                return sum;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

}
