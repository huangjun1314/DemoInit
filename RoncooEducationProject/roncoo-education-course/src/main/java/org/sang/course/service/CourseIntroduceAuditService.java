package org.sang.course.service;


import org.sang.config.pojo.course.CourseIntroduceAudit;

import java.util.List;

/**
 * 课程介绍信息-审核(CourseIntroduceAudit)表服务接口
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
public interface CourseIntroduceAuditService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CourseIntroduceAudit queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CourseIntroduceAudit> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param courseIntroduceAudit 实例对象
     * @return 实例对象
     */
    CourseIntroduceAudit insert(CourseIntroduceAudit courseIntroduceAudit);

    /**
     * 修改数据
     *
     * @param courseIntroduceAudit 实例对象
     * @return 实例对象
     */
    CourseIntroduceAudit update(CourseIntroduceAudit courseIntroduceAudit);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}