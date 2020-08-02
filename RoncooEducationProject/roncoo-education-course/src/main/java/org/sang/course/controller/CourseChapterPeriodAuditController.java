package org.sang.course.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sang.course.service.CourseChapterPeriodAuditService;
import org.sang.config.pojo.course.CourseChapterPeriodAudit;

import javax.annotation.Resource;

/**
 * 课时信息-审核(CourseChapterPeriodAudit)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
@RestController
@RequestMapping("courseChapterPeriodAudit")
@Api(tags = "课时信息-审核(CourseChapterPeriodAudit)表控制层")
public class CourseChapterPeriodAuditController {
    /**
     * 服务对象
     */
    @Resource
    private CourseChapterPeriodAuditService courseChapterPeriodAuditService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CourseChapterPeriodAudit selectOne(Long id) {
        return this.courseChapterPeriodAuditService.queryById(id);
    }

}
