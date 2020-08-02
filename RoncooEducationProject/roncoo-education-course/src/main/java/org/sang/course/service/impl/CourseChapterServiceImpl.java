package org.sang.course.service.impl;


import org.springframework.stereotype.Service;
import org.sang.course.dao.CourseChapterDao;
import org.sang.course.service.CourseChapterService;
import org.sang.config.pojo.course.CourseChapter;

import javax.annotation.Resource;
import java.util.List;

/**
 * 章节信息(CourseChapter)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
@Service("courseChapterService")
public class CourseChapterServiceImpl implements CourseChapterService {
    @Resource
    private CourseChapterDao courseChapterDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CourseChapter queryById(Long id) {
        return this.courseChapterDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CourseChapter> queryAllByLimit(int offset, int limit) {
        return this.courseChapterDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param courseChapter 实例对象
     * @return 实例对象
     */
    @Override
    public CourseChapter insert(CourseChapter courseChapter) {
        this.courseChapterDao.insert(courseChapter);
        return courseChapter;
    }

    /**
     * 修改数据
     *
     * @param courseChapter 实例对象
     * @return 实例对象
     */
    @Override
    public CourseChapter update(CourseChapter courseChapter) {
        this.courseChapterDao.update(courseChapter);
        return this.queryById(courseChapter.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.courseChapterDao.deleteById(id) > 0;
    }
}