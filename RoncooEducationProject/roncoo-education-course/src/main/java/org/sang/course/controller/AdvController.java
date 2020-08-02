package org.sang.course.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sang.course.service.AdvService;
import org.sang.config.pojo.course.Adv;

import javax.annotation.Resource;

/**
 * 广告信息(Adv)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
@RestController
@RequestMapping("adv")
@Api(tags = "广告信息(Adv)表控制层")
public class AdvController {
    /**
     * 服务对象
     */
    @Resource
    private AdvService advService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("通过主键查询单条数据")
    @GetMapping("selectOne")
    public Adv selectOne(Long id) {
        return this.advService.queryById(id);
    }

}
