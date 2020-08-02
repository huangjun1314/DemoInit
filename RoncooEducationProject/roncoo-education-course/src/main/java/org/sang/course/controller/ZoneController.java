package org.sang.course.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sang.course.service.ZoneService;
import org.sang.config.pojo.course.Zone;

import javax.annotation.Resource;

/**
 * 专区(Zone)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@RestController
@RequestMapping("zone")
@Api(tags = "专区(Zone)表控制层")
public class ZoneController {
    /**
     * 服务对象
     */
    @Resource
    private ZoneService zoneService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Zone selectOne(Long id) {
        return this.zoneService.queryById(id);
    }

}
