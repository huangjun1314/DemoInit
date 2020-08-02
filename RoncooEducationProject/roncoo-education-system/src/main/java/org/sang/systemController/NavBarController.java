package org.sang.systemController;

import org.sang.systementity.NavBar;
import org.sang.systemservice.NavBarService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 头部导航(NavBar)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:32:42
 */
@RestController
@RequestMapping("/system/navBar")
@Api(tags = "头部导航(NavBar)表控制层")
public class NavBarController {
    /**
     * 服务对象
     */
    @Resource
    private NavBarService navBarService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public NavBar selectOne(Long id) {
        return this.navBarService.queryById(id);
    }

}
