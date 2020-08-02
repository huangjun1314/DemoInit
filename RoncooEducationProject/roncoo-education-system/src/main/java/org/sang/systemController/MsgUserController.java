package org.sang.systemController;

import org.sang.systementity.MsgUser;
import org.sang.systemservice.MsgUserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 站内信用户记录表(MsgUser)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:32:41
 */
@RestController
@RequestMapping("/system/msgUser")
@Api(tags = "站内信用户记录表(MsgUser)表控制层")
public class MsgUserController {
    /**
     * 服务对象
     */
    @Resource
    private MsgUserService msgUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MsgUser selectOne(Long id) {
        return this.msgUserService.queryById(id);
    }

}
