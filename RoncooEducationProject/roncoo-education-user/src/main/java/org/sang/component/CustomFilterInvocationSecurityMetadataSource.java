package org.sang.component;

import org.sang.entity.SysMenu;
import org.sang.entity.SysRole;
import org.sang.mapper1.sysmenu.SysMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

@Component
public class CustomFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Autowired
    SysMenuMapper sysMenuMapper;

    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) object).getRequestUrl();
        List<SysMenu> allSysMenus = sysMenuMapper.getAllSysMenuList();
        for (SysMenu sysMenu:allSysMenus){
            if (antPathMatcher.match(sysMenu.getMenuName(),requestUrl)){
                List<SysRole> sysRoles = sysMenu.getSysRoleList();
                String[] roleArr = new String[sysRoles.size()];
                for (int i=0;i<roleArr.length;i++){
                    roleArr[i] = sysRoles.get(i).getRoleName();
                }
                return SecurityConfig.createList(roleArr);
            }
        }
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return FilterInvocation.class.isAssignableFrom(clazz);
    }
}
