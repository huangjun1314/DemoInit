package org.sang.systemController;

import org.sang.systementity.WebsiteNavArticle;
import org.sang.systemservice.WebsiteNavArticleService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 站点导航文章(WebsiteNavArticle)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:32:42
 */
@RestController
@RequestMapping("/system/websiteNavArticle")
@Api(tags = "站点导航文章(WebsiteNavArticle)表控制层")
public class WebsiteNavArticleController {
    /**
     * 服务对象
     */
    @Resource
    private WebsiteNavArticleService websiteNavArticleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WebsiteNavArticle selectOne(Long id) {
        return this.websiteNavArticleService.queryById(id);
    }

}
