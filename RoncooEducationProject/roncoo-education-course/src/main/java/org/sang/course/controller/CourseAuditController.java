package org.sang.course.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sang.course.service.CourseAuditService;
import org.sang.config.pojo.course.CourseAudit;

import javax.annotation.Resource;

/**
 * 课程信息-审核(CourseAudit)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
@RestController
@RequestMapping("courseAudit")
@Api(tags = "课程信息-审核(CourseAudit)表控制层")
public class CourseAuditController {
    /**
     * 服务对象
     */
    @Resource
    private CourseAuditService courseAuditService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CourseAudit selectOne(Long id) {
        return this.courseAuditService.queryById(id);
    }

}
