package org.sang.systemController;

import org.sang.systementity.WebsiteLink;
import org.sang.systemservice.WebsiteLinkService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 站点友情链接(WebsiteLink)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:32:42
 */
@RestController
@RequestMapping("/system/websiteLink")
@Api(tags = "站点友情链接(WebsiteLink)表控制层")
public class WebsiteLinkController {
    /**
     * 服务对象
     */
    @Resource
    private WebsiteLinkService websiteLinkService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WebsiteLink selectOne(Long id) {
        return this.websiteLinkService.queryById(id);
    }

}
