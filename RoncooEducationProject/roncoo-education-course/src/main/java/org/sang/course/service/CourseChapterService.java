package org.sang.course.service;


import org.sang.config.pojo.course.CourseChapter;

import java.util.List;

/**
 * 章节信息(CourseChapter)表服务接口
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
public interface CourseChapterService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CourseChapter queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CourseChapter> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param courseChapter 实例对象
     * @return 实例对象
     */
    CourseChapter insert(CourseChapter courseChapter);

    /**
     * 修改数据
     *
     * @param courseChapter 实例对象
     * @return 实例对象
     */
    CourseChapter update(CourseChapter courseChapter);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}