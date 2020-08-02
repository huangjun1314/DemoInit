package org.sang.mapper1.sysuser;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.entity.SysRole;
import org.sang.entity.SysUser;

import java.util.List;

@Mapper
public interface SysUserMapper {

    /**
     * 根据手机号查询后台用户信息
     * @param mobile
     * @return
     */
    SysUser loadUserByUsername(@Param("mobile") String mobile);

    /**
     * sys_role和sys_role_user两表联合查询
     * 根据sys_user的id查询角色信息
     * @param id
     * @return
     */
    List<SysRole> getSysRoleListByUid(String id);

    /**
     * 根据手机号直接查询后台用户信息
     * @param mobile
     * @return
     */
    public List<SysUser> getAllSysUserASByMobile(@Param("mobile") String mobile);

    /**
     * 查询SysUser里有多少条数据
     * @return
     */
    public int selSysUserCount();

    /**
     * 添加后台用户
     * @param sysUser
     * @return
     */
    public int insertSysUser(SysUser sysUser);

    /**
     * 根据手机号修改后台用户
     * @param realName 真实姓名
     * @param sort 排序
     * @param remark 备注
     * @param mobile 手机号
     * @return
     */
    public int modifySysUser(@Param("realName")String realName,@Param("sort") int sort
            ,@Param("remark") String remark,@Param("mobile") String mobile);

    /**
     * 根据手机号删除后台用户
     * @param mobile
     * @return
     */
    public int delSysUserByMobile(String mobile);
}
