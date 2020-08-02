package org.sang.course.service;


import org.sang.config.pojo.course.CourseIntroduce;

import java.util.List;

/**
 * 课程介绍信息(CourseIntroduce)表服务接口
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
public interface CourseIntroduceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CourseIntroduce queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CourseIntroduce> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param courseIntroduce 实例对象
     * @return 实例对象
     */
    CourseIntroduce insert(CourseIntroduce courseIntroduce);

    /**
     * 修改数据
     *
     * @param courseIntroduce 实例对象
     * @return 实例对象
     */
    CourseIntroduce update(CourseIntroduce courseIntroduce);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}