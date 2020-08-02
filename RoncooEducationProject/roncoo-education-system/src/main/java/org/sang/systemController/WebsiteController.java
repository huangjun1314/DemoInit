package org.sang.systemController;

import org.sang.systementity.Website;
import org.sang.systemservice.WebsiteService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 站点信息(Website)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:32:42
 */
@RestController
@RequestMapping("/system/website")
@Api(tags = "站点管理")
public class WebsiteController {
    /**
     * 服务对象
     */
    @Resource
    private WebsiteService websiteService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Website selectOne(Long id) {
        return this.websiteService.queryById(id);
    }

}
