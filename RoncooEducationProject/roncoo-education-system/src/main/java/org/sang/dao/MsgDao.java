package org.sang.dao;

import org.sang.systementity.Msg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 站内信息表(Msg)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-08 10:32:41
 */
@Mapper
public interface MsgDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Msg queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Msg> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param msg 实例对象
     * @return 对象列表
     */
    List<Msg> queryAll(Msg msg);

    /**
     * 新增数据
     *
     * @param msg 实例对象
     * @return 影响行数
     */
    int insert(Msg msg);

    /**
     * 修改数据
     *
     * @param msg 实例对象
     * @return 影响行数
     */
    int update(Msg msg);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}
