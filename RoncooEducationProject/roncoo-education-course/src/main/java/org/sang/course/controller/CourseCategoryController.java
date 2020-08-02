package org.sang.course.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sang.course.service.CourseCategoryService;
import org.sang.config.pojo.course.CourseCategory;

import javax.annotation.Resource;

/**
 * 课程分类(CourseCategory)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
@RestController
@RequestMapping("courseCategory")
@Api(tags = "课程分类(CourseCategory)表控制层")
public class CourseCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private CourseCategoryService courseCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CourseCategory selectOne(Long id) {
        return this.courseCategoryService.queryById(id);
    }

}
