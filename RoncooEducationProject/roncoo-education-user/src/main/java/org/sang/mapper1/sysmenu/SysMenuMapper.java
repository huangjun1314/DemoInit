package org.sang.mapper1.sysmenu;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.entity.SysMenu;

import java.util.List;

@Mapper
public interface SysMenuMapper {

    /**
     * 查询所有
     * @return
     */
    List<SysMenu> getAllSysMenuList();

    /**
     * 在Sys_menu_role添加菜单角色关联
     * 即设置权限
     * @param menuId 菜单id
     * @param roleId 角色id
     * @return
     */
    int insetSetThePpermissions(@Param("menuId") String menuId,@Param("roleId") String roleId);

    /**
     * 根据角色id删除权限
     * @param roleId
     * @return
     */
    int delByRoleId(@Param("roleId") String roleId);

    /**
     * 修改数据
     *
     * @param sysMenu 实例对象
     * @return 影响行数
     */
    int update(SysMenu sysMenu);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysMenu queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysMenu> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysMenu 实例对象
     * @return 对象列表
     */
    List<SysMenu> queryAll(SysMenu sysMenu);
}
