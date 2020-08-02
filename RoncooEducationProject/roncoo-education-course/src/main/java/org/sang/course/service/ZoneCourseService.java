package org.sang.course.service;


import org.sang.config.pojo.course.ZoneCourse;

import java.util.List;

/**
 * 专区课程关联表(ZoneCourse)表服务接口
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
public interface ZoneCourseService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ZoneCourse queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ZoneCourse> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param zoneCourse 实例对象
     * @return 实例对象
     */
    ZoneCourse insert(ZoneCourse zoneCourse);

    /**
     * 修改数据
     *
     * @param zoneCourse 实例对象
     * @return 实例对象
     */
    ZoneCourse update(ZoneCourse zoneCourse);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param zoneCourse 实例对象
     * @return 对象列表
     */
    List<ZoneCourse> queryAll(ZoneCourse zoneCourse);

}