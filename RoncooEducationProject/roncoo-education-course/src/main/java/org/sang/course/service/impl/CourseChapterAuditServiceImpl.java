package org.sang.course.service.impl;


import org.springframework.stereotype.Service;
import org.sang.course.dao.CourseChapterAuditDao;
import org.sang.course.service.CourseChapterAuditService;
import org.sang.config.pojo.course.CourseChapterAudit;

import javax.annotation.Resource;
import java.util.List;

/**
 * 章节信息-审核(CourseChapterAudit)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
@Service("courseChapterAuditService")
public class CourseChapterAuditServiceImpl implements CourseChapterAuditService {
    @Resource
    private CourseChapterAuditDao courseChapterAuditDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CourseChapterAudit queryById(Long id) {
        return this.courseChapterAuditDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CourseChapterAudit> queryAllByLimit(int offset, int limit) {
        return this.courseChapterAuditDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param courseChapterAudit 实例对象
     * @return 实例对象
     */
    @Override
    public CourseChapterAudit insert(CourseChapterAudit courseChapterAudit) {
        this.courseChapterAuditDao.insert(courseChapterAudit);
        return courseChapterAudit;
    }

    /**
     * 修改数据
     *
     * @param courseChapterAudit 实例对象
     * @return 实例对象
     */
    @Override
    public CourseChapterAudit update(CourseChapterAudit courseChapterAudit) {
        this.courseChapterAuditDao.update(courseChapterAudit);
        return this.queryById(courseChapterAudit.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.courseChapterAuditDao.deleteById(id) > 0;
    }
}