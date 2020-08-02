package org.sang.course.service;


import org.sang.config.pojo.course.CourseChapterPeriod;

import java.util.List;

/**
 * 课时信息(CourseChapterPeriod)表服务接口
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
public interface CourseChapterPeriodService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CourseChapterPeriod queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CourseChapterPeriod> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param courseChapterPeriod 实例对象
     * @return 实例对象
     */
    CourseChapterPeriod insert(CourseChapterPeriod courseChapterPeriod);

    /**
     * 修改数据
     *
     * @param courseChapterPeriod 实例对象
     * @return 实例对象
     */
    CourseChapterPeriod update(CourseChapterPeriod courseChapterPeriod);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}