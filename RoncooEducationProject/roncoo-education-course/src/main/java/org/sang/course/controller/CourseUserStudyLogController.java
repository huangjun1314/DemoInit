package org.sang.course.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sang.course.service.CourseUserStudyLogService;
import org.sang.config.pojo.course.CourseUserStudyLog;

import javax.annotation.Resource;

/**
 * 课程用户学习日志(CourseUserStudyLog)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@RestController
@RequestMapping("courseUserStudyLog")
@Api(tags = "课程用户学习日志(CourseUserStudyLog)表控制层")
public class CourseUserStudyLogController {
    /**
     * 服务对象
     */
    @Resource
    private CourseUserStudyLogService courseUserStudyLogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CourseUserStudyLog selectOne(Long id) {
        return this.courseUserStudyLogService.queryById(id);
    }

}
