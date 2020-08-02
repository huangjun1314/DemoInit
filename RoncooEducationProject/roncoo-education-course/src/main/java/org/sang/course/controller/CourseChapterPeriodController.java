package org.sang.course.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sang.course.service.CourseChapterPeriodService;
import org.sang.config.pojo.course.CourseChapterPeriod;

import javax.annotation.Resource;

/**
 * 课时信息(CourseChapterPeriod)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
@RestController
@RequestMapping("courseChapterPeriod")
@Api(tags = "课时信息(CourseChapterPeriod)表控制层")
public class CourseChapterPeriodController {
    /**
     * 服务对象
     */
    @Resource
    private CourseChapterPeriodService courseChapterPeriodService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CourseChapterPeriod selectOne(Long id) {
        return this.courseChapterPeriodService.queryById(id);
    }

}
