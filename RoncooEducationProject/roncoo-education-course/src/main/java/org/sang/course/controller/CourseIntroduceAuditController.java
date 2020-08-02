package org.sang.course.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sang.course.service.CourseIntroduceAuditService;
import org.sang.config.pojo.course.CourseIntroduceAudit;

import javax.annotation.Resource;

/**
 * 课程介绍信息-审核(CourseIntroduceAudit)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@RestController
@RequestMapping("courseIntroduceAudit")
@Api(tags = "课程介绍信息-审核(CourseIntroduceAudit)表控制层")
public class CourseIntroduceAuditController {
    /**
     * 服务对象
     */
    @Resource
    private CourseIntroduceAuditService courseIntroduceAuditService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CourseIntroduceAudit selectOne(Long id) {
        return this.courseIntroduceAuditService.queryById(id);
    }

}
