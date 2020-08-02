package org.sang.systemController;

import org.sang.systementity.Msg;
import org.sang.systemservice.MsgService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 站内信息表(Msg)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:32:41
 */
@RestController
@RequestMapping("/system/msg")
@Api(tags = "站内信息表(Msg)表控制层")
public class MsgController {
    /**
     * 服务对象
     */
    @Resource
    private MsgService msgService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Msg selectOne(Long id) {
		System.out.println(id);
        return this.msgService.queryById(id);
    }

}
