package org.sang.course.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sang.course.service.FileStorageService;
import org.sang.config.pojo.course.FileStorage;

import javax.annotation.Resource;

/**
 * 文件存储表(FileStorage)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@RestController
@RequestMapping("fileStorage")
@Api(tags = "文件存储表(FileStorage)表控制层")
public class FileStorageController {
    /**
     * 服务对象
     */
    @Resource
    private FileStorageService fileStorageService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public FileStorage selectOne(Long id) {
        return this.fileStorageService.queryById(id);
    }

}
