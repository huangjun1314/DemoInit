package org.sang.mapper1.sysrole;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.entity.SysRole;

import java.util.List;

@Mapper
public interface SysRoleMapper {

    /**
     * 多条件查询
     * @param //roleName 名称
     * @param //statusId 状态
     * @return
     */
    //List<SysRole> getAllRoleAndByRoleNameAndStatusId(@Param("roleName") String roleName, @Param("statusId") String statusId);

    /**
     * 默认查询全部
     * @return
     */
    List<SysRole> getAllRole();

    /**
     * 添加数据
     * @param roleName 名称
     * @param remark 备注
     * @return
     */
    public int insertRole(@Param("roleName") String roleName ,@Param("remark") String remark);

    /**
     * 修改
     * @param roleName 名称
     * @param sort 排序
     * @param remark 备注
     * @param statusId 状态
     * @return
     */
    public int updateRole(@Param("roleName") String roleName, @Param("sort") String sort
            ,@Param("remark") String remark, @Param("statusId") String statusId, @Param("id") String id);

    /**
     * 删除
     * @param id
     * @return
     */
    public int delRoleById(@Param("id") String id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysRole 实例对象
     * @return 对象列表
     */
    List<SysRole> queryAll(SysRole sysRole);
}
