package org.sang.course.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sang.course.service.CourseChapterService;
import org.sang.config.pojo.course.CourseChapter;

import javax.annotation.Resource;

/**
 * 章节信息(CourseChapter)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
@RestController
@RequestMapping("courseChapter")
@Api(tags = "章节信息(CourseChapter)表控制层")
public class CourseChapterController {
    /**
     * 服务对象
     */
    @Resource
    private CourseChapterService courseChapterService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CourseChapter selectOne(Long id) {
        return this.courseChapterService.queryById(id);
    }

}
