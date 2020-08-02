package org.sang.course.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sang.course.service.CourseRecommendService;
import org.sang.config.pojo.course.CourseRecommend;

import javax.annotation.Resource;

/**
 * 课程推荐(CourseRecommend)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@RestController
@RequestMapping("courseRecommend")
@Api(tags = "课程推荐(CourseRecommend)表控制层")
public class CourseRecommendController {
    /**
     * 服务对象
     */
    @Resource
    private CourseRecommendService courseRecommendService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CourseRecommend selectOne(Long id) {
        return this.courseRecommendService.queryById(id);
    }

}
