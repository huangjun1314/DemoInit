package org.sang.course.service.impl;


import org.springframework.stereotype.Service;
import org.sang.course.dao.CourseUserStudyLogDao;
import org.sang.course.service.CourseUserStudyLogService;
import org.sang.config.pojo.course.CourseUserStudyLog;

import javax.annotation.Resource;
import java.util.List;

/**
 * 课程用户学习日志(CourseUserStudyLog)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@Service("courseUserStudyLogService")
public class CourseUserStudyLogServiceImpl implements CourseUserStudyLogService {
    @Resource
    private CourseUserStudyLogDao courseUserStudyLogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CourseUserStudyLog queryById(Long id) {
        return this.courseUserStudyLogDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CourseUserStudyLog> queryAllByLimit(int offset, int limit) {
        return this.courseUserStudyLogDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param courseUserStudyLog 实例对象
     * @return 实例对象
     */
    @Override
    public CourseUserStudyLog insert(CourseUserStudyLog courseUserStudyLog) {
        this.courseUserStudyLogDao.insert(courseUserStudyLog);
        return courseUserStudyLog;
    }

    /**
     * 修改数据
     *
     * @param courseUserStudyLog 实例对象
     * @return 实例对象
     */
    @Override
    public CourseUserStudyLog update(CourseUserStudyLog courseUserStudyLog) {
        this.courseUserStudyLogDao.update(courseUserStudyLog);
        return this.queryById(courseUserStudyLog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.courseUserStudyLogDao.deleteById(id) > 0;
    }
}