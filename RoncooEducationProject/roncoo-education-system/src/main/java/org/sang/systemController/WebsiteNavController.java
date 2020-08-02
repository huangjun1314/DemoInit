package org.sang.systemController;

import org.sang.systementity.WebsiteNav;
import org.sang.systemservice.WebsiteNavService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 站点导航(WebsiteNav)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:32:42
 */
@RestController
@RequestMapping("/system/websiteNav")
@Api(tags = "站点导航(WebsiteNav)表控制层")
public class WebsiteNavController {
    /**
     * 服务对象
     */
    @Resource
    private WebsiteNavService websiteNavService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WebsiteNav selectOne(Long id) {
        return this.websiteNavService.queryById(id);
    }

}
