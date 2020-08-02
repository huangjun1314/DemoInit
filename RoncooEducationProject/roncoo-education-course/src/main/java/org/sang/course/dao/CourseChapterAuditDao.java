package org.sang.course.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.config.pojo.course.CourseChapterAudit;

import java.util.List;

/**
 * 章节信息-审核(CourseChapterAudit)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
@Mapper
public interface CourseChapterAuditDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CourseChapterAudit queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CourseChapterAudit> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param courseChapterAudit 实例对象
     * @return 对象列表
     */
    List<CourseChapterAudit> queryAll(CourseChapterAudit courseChapterAudit);

    /**
     * 新增数据
     *
     * @param courseChapterAudit 实例对象
     * @return 影响行数
     */
    int insert(CourseChapterAudit courseChapterAudit);

    /**
     * 修改数据
     *
     * @param courseChapterAudit 实例对象
     * @return 影响行数
     */
    int update(CourseChapterAudit courseChapterAudit);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}
