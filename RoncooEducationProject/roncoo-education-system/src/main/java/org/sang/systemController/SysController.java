package org.sang.systemController;

import org.sang.systementity.Sys;
import org.sang.systemservice.SysService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 系统配置表(Sys)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:32:42
 */
@RestController
@RequestMapping("/system/sys")
@Api(tags = "系统配置表(Sys)表控制层")
public class SysController {
    /**
     * 服务对象
     */
    @Resource
    private SysService sysService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Sys selectOne(Long id) {
        return this.sysService.queryById(id);
    }

}
