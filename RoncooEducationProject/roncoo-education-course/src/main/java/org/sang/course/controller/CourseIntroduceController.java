package org.sang.course.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sang.course.service.CourseIntroduceService;
import org.sang.config.pojo.course.CourseIntroduce;

import javax.annotation.Resource;

/**
 * 课程介绍信息(CourseIntroduce)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
@RestController
@RequestMapping("courseIntroduce")
@Api(tags = "课程介绍信息(CourseIntroduce)表控制层")
public class CourseIntroduceController {
    /**
     * 服务对象
     */
    @Resource
    private CourseIntroduceService courseIntroduceService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CourseIntroduce selectOne(Long id) {
        return this.courseIntroduceService.queryById(id);
    }

}
