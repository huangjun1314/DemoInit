package org.sang.course.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.config.pojo.course.CourseUserStudy;

import java.util.List;

/**
 * 课程用户关联表(CourseUserStudy)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@Mapper
public interface CourseUserStudyDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CourseUserStudy queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CourseUserStudy> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param courseUserStudy 实例对象
     * @return 对象列表
     */
    List<CourseUserStudy> queryAll(CourseUserStudy courseUserStudy);

    /**
     * 新增数据
     *
     * @param courseUserStudy 实例对象
     * @return 影响行数
     */
    int insert(CourseUserStudy courseUserStudy);

    /**
     * 修改数据
     *
     * @param courseUserStudy 实例对象
     * @return 影响行数
     */
    int update(CourseUserStudy courseUserStudy);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}
