package org.sang.service;

import org.sang.entity.SysRole;
import org.sang.entity.SysUser;
import org.sang.entity.User;
import org.sang.mapper1.sysuser.SysUserMapper;
import org.sang.mapper2.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManagementService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Autowired
    UserMapper userMapper;

    public User loadUserByUsername(String mobile){
        User user = userMapper.loadUserByUsername(mobile);
        return user;
    }

    public List<SysUser> getAllSysUserASByMobile(String mobile){
        List<SysUser> sysUserList = sysUserMapper.getAllSysUserASByMobile(mobile);
        for (SysUser sysUser : sysUserList){
            List<SysRole> sysRoleList = sysUserMapper.getSysRoleListByUid(sysUser.getId());
            sysUser.setSysRoleList(sysRoleList);
        }
        return sysUserList;
    }

    public int insertSysUserAndUser(String mobile,String realName,String remark){
        try {
            User user = userMapper.loadUserByUsername(mobile);

            int count = sysUserMapper.selSysUserCount();

            SysUser sysUser = new SysUser();
            sysUser.setId(count+1+"");
            sysUser.setStatusId(1);
            sysUser.setSort(1);
            sysUser.setRealName(realName);
            sysUser.setRemark(remark);
            sysUser.setMobile(mobile);
            sysUser.setUserNo(user.getUserNo());

            sysUserMapper.insertSysUser(sysUser);
        } catch (Exception e){
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    public int modifySysUser(String realName,int sort
            ,String remark,String mobile){
        int num = 0;
        try {
            num = sysUserMapper.modifySysUser(realName,sort,remark,mobile);
        } catch (Exception e){
            e.printStackTrace();
        }
        return num;
    }

    public int delSysUserByMobile(String mobile){
        int num = 0;
        try {
            sysUserMapper.delSysUserByMobile(mobile);
            num = 1;
        } catch (Exception e){
            e.printStackTrace();
        }
        return num;
    }

    public int modifyUserByMobile(String mobilePsw, String mobile){
        int num = 0;
        try {
            num = userMapper.modifyUserByMobile(mobilePsw,mobile);
        } catch (Exception e){
            e.printStackTrace();
        }
        return num;
    }

}
