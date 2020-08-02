package org.sang.course.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sang.course.service.CourseVideoService;
import org.sang.config.pojo.course.CourseVideo;

import javax.annotation.Resource;

/**
 * 课程视频信息(CourseVideo)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@RestController
@RequestMapping("courseVideo")
@Api(tags = "课程视频信息(CourseVideo)表控制层")
public class CourseVideoController {
    /**
     * 服务对象
     */
    @Resource
    private CourseVideoService courseVideoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CourseVideo selectOne(Long id) {
        return this.courseVideoService.queryById(id);
    }

}
