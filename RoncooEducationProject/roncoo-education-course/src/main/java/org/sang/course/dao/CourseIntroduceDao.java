package org.sang.course.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.config.pojo.course.CourseIntroduce;

import java.util.List;

/**
 * 课程介绍信息(CourseIntroduce)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
@Mapper
public interface CourseIntroduceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CourseIntroduce queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CourseIntroduce> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param courseIntroduce 实例对象
     * @return 对象列表
     */
    List<CourseIntroduce> queryAll(CourseIntroduce courseIntroduce);

    /**
     * 新增数据
     *
     * @param courseIntroduce 实例对象
     * @return 影响行数
     */
    int insert(CourseIntroduce courseIntroduce);

    /**
     * 修改数据
     *
     * @param courseIntroduce 实例对象
     * @return 影响行数
     */
    int update(CourseIntroduce courseIntroduce);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}
