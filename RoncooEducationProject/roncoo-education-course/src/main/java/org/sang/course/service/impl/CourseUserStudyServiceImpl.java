package org.sang.course.service.impl;


import org.springframework.stereotype.Service;
import org.sang.course.dao.CourseUserStudyDao;
import org.sang.course.service.CourseUserStudyService;
import org.sang.config.pojo.course.CourseUserStudy;

import javax.annotation.Resource;
import java.util.List;

/**
 * 课程用户关联表(CourseUserStudy)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@Service("courseUserStudyService")
public class CourseUserStudyServiceImpl implements CourseUserStudyService {
    @Resource
    private CourseUserStudyDao courseUserStudyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CourseUserStudy queryById(Long id) {
        return this.courseUserStudyDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CourseUserStudy> queryAllByLimit(int offset, int limit) {
        return this.courseUserStudyDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param courseUserStudy 实例对象
     * @return 实例对象
     */
    @Override
    public CourseUserStudy insert(CourseUserStudy courseUserStudy) {
        this.courseUserStudyDao.insert(courseUserStudy);
        return courseUserStudy;
    }

    /**
     * 修改数据
     *
     * @param courseUserStudy 实例对象
     * @return 实例对象
     */
    @Override
    public CourseUserStudy update(CourseUserStudy courseUserStudy) {
        this.courseUserStudyDao.update(courseUserStudy);
        return this.queryById(courseUserStudy.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.courseUserStudyDao.deleteById(id) > 0;
    }
}