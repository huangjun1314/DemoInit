package org.sang.course.service.impl;


import org.springframework.stereotype.Service;
import org.sang.course.dao.CourseChapterPeriodAuditDao;
import org.sang.course.service.CourseChapterPeriodAuditService;
import org.sang.config.pojo.course.CourseChapterPeriodAudit;

import javax.annotation.Resource;
import java.util.List;

/**
 * 课时信息-审核(CourseChapterPeriodAudit)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
@Service("courseChapterPeriodAuditService")
public class CourseChapterPeriodAuditServiceImpl implements CourseChapterPeriodAuditService {
    @Resource
    private CourseChapterPeriodAuditDao courseChapterPeriodAuditDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CourseChapterPeriodAudit queryById(Long id) {
        return this.courseChapterPeriodAuditDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CourseChapterPeriodAudit> queryAllByLimit(int offset, int limit) {
        return this.courseChapterPeriodAuditDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param courseChapterPeriodAudit 实例对象
     * @return 实例对象
     */
    @Override
    public CourseChapterPeriodAudit insert(CourseChapterPeriodAudit courseChapterPeriodAudit) {
        this.courseChapterPeriodAuditDao.insert(courseChapterPeriodAudit);
        return courseChapterPeriodAudit;
    }

    /**
     * 修改数据
     *
     * @param courseChapterPeriodAudit 实例对象
     * @return 实例对象
     */
    @Override
    public CourseChapterPeriodAudit update(CourseChapterPeriodAudit courseChapterPeriodAudit) {
        this.courseChapterPeriodAuditDao.update(courseChapterPeriodAudit);
        return this.queryById(courseChapterPeriodAudit.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.courseChapterPeriodAuditDao.deleteById(id) > 0;
    }
}