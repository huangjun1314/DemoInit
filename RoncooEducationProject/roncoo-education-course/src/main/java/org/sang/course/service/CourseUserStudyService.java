package org.sang.course.service;


import org.sang.config.pojo.course.CourseUserStudy;

import java.util.List;

/**
 * 课程用户关联表(CourseUserStudy)表服务接口
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
public interface CourseUserStudyService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CourseUserStudy queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CourseUserStudy> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param courseUserStudy 实例对象
     * @return 实例对象
     */
    CourseUserStudy insert(CourseUserStudy courseUserStudy);

    /**
     * 修改数据
     *
     * @param courseUserStudy 实例对象
     * @return 实例对象
     */
    CourseUserStudy update(CourseUserStudy courseUserStudy);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}