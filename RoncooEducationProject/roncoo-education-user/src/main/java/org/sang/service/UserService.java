package org.sang.service;

import org.sang.entity.SysRole;
import org.sang.entity.SysUser;
import org.sang.entity.User;
import org.sang.mapper1.sysuser.SysUserMapper;
import org.sang.mapper2.user.UserMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService implements UserDetailsService {

    @Resource
    SysUserMapper sysUserMapper;

    @Resource
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String mobile) throws UsernameNotFoundException {
        User user = userMapper.loadUserByUsername(mobile);
        SysUser sysUser = sysUserMapper.loadUserByUsername(mobile);
        if (null == user && null == sysUser){
            throw new UsernameNotFoundException("不存在");
        }
        List<SysRole> sysRoleList = sysUserMapper.getSysRoleListByUid(sysUser.getId());
        sysUser.setSysRoleList(sysRoleList);
        user.setSysRoleList(sysRoleList);
        return user;
    }
}
