package org.sang.course.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sang.course.service.CourseChapterAuditService;
import org.sang.config.pojo.course.CourseChapterAudit;

import javax.annotation.Resource;

/**
 * 章节信息-审核(CourseChapterAudit)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
@RestController
@RequestMapping("courseChapterAudit")
@Api(tags = "章节信息-审核(CourseChapterAudit)表控制层")
public class CourseChapterAuditController {
    /**
     * 服务对象
     */
    @Resource
    private CourseChapterAuditService courseChapterAuditService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CourseChapterAudit selectOne(Long id) {
        return this.courseChapterAuditService.queryById(id);
    }

}
