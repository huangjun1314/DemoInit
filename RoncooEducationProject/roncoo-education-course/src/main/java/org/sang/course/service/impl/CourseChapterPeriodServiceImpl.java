package org.sang.course.service.impl;


import org.springframework.stereotype.Service;
import org.sang.course.dao.CourseChapterPeriodDao;
import org.sang.course.service.CourseChapterPeriodService;
import org.sang.config.pojo.course.CourseChapterPeriod;

import javax.annotation.Resource;
import java.util.List;

/**
 * 课时信息(CourseChapterPeriod)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
@Service("courseChapterPeriodService")
public class CourseChapterPeriodServiceImpl implements CourseChapterPeriodService {
    @Resource
    private CourseChapterPeriodDao courseChapterPeriodDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CourseChapterPeriod queryById(Long id) {
        return this.courseChapterPeriodDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CourseChapterPeriod> queryAllByLimit(int offset, int limit) {
        return this.courseChapterPeriodDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param courseChapterPeriod 实例对象
     * @return 实例对象
     */
    @Override
    public CourseChapterPeriod insert(CourseChapterPeriod courseChapterPeriod) {
        this.courseChapterPeriodDao.insert(courseChapterPeriod);
        return courseChapterPeriod;
    }

    /**
     * 修改数据
     *
     * @param courseChapterPeriod 实例对象
     * @return 实例对象
     */
    @Override
    public CourseChapterPeriod update(CourseChapterPeriod courseChapterPeriod) {
        this.courseChapterPeriodDao.update(courseChapterPeriod);
        return this.queryById(courseChapterPeriod.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.courseChapterPeriodDao.deleteById(id) > 0;
    }
}