package org.sang.course.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sang.course.service.DicListService;
import org.sang.config.pojo.course.DicList;

import javax.annotation.Resource;

/**
 * 数据字典明细表(DicList)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@RestController
@RequestMapping("dicList")
@Api(tags = "数据字典明细表(DicList)表控制层")
public class DicListController {
    /**
     * 服务对象
     */
    @Resource
    private DicListService dicListService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DicList selectOne(Long id) {
        return this.dicListService.queryById(id);
    }

}
