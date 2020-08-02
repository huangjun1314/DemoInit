package org.sang.course.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sang.course.service.CourseUserStudyService;
import org.sang.config.pojo.course.CourseUserStudy;

import javax.annotation.Resource;

/**
 * 课程用户关联表(CourseUserStudy)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@RestController
@RequestMapping("courseUserStudy")
@Api(tags = "课程用户关联表(CourseUserStudy)表控制层")
public class CourseUserStudyController {
    /**
     * 服务对象
     */
    @Resource
    private CourseUserStudyService courseUserStudyService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CourseUserStudy selectOne(Long id) {
        return this.courseUserStudyService.queryById(id);
    }

}
