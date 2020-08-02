package org.sang.course.service.impl;


import org.springframework.stereotype.Service;
import org.sang.course.dao.CourseIntroduceAuditDao;
import org.sang.course.service.CourseIntroduceAuditService;
import org.sang.config.pojo.course.CourseIntroduceAudit;

import javax.annotation.Resource;
import java.util.List;

/**
 * 课程介绍信息-审核(CourseIntroduceAudit)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@Service("courseIntroduceAuditService")
public class CourseIntroduceAuditServiceImpl implements CourseIntroduceAuditService {
    @Resource
    private CourseIntroduceAuditDao courseIntroduceAuditDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CourseIntroduceAudit queryById(Long id) {
        return this.courseIntroduceAuditDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CourseIntroduceAudit> queryAllByLimit(int offset, int limit) {
        return this.courseIntroduceAuditDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param courseIntroduceAudit 实例对象
     * @return 实例对象
     */
    @Override
    public CourseIntroduceAudit insert(CourseIntroduceAudit courseIntroduceAudit) {
        this.courseIntroduceAuditDao.insert(courseIntroduceAudit);
        return courseIntroduceAudit;
    }

    /**
     * 修改数据
     *
     * @param courseIntroduceAudit 实例对象
     * @return 实例对象
     */
    @Override
    public CourseIntroduceAudit update(CourseIntroduceAudit courseIntroduceAudit) {
        this.courseIntroduceAuditDao.update(courseIntroduceAudit);
        return this.queryById(courseIntroduceAudit.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.courseIntroduceAuditDao.deleteById(id) > 0;
    }
}