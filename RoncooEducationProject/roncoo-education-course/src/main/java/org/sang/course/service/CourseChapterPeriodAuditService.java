package org.sang.course.service;


import org.sang.config.pojo.course.CourseChapterPeriodAudit;

import java.util.List;

/**
 * 课时信息-审核(CourseChapterPeriodAudit)表服务接口
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
public interface CourseChapterPeriodAuditService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CourseChapterPeriodAudit queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CourseChapterPeriodAudit> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param courseChapterPeriodAudit 实例对象
     * @return 实例对象
     */
    CourseChapterPeriodAudit insert(CourseChapterPeriodAudit courseChapterPeriodAudit);

    /**
     * 修改数据
     *
     * @param courseChapterPeriodAudit 实例对象
     * @return 实例对象
     */
    CourseChapterPeriodAudit update(CourseChapterPeriodAudit courseChapterPeriodAudit);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}