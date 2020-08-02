package org.sang.systemController;

import org.sang.systementity.MsgTemplate;
import org.sang.systemservice.MsgTemplateService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 消息模板(MsgTemplate)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:32:41
 */
@RestController
@RequestMapping("/system/msgTemplate")
@Api(tags = "消息模板(MsgTemplate)表控制层")
public class MsgTemplateController {
    /**
     * 服务对象
     */
    @Resource
    private MsgTemplateService msgTemplateService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MsgTemplate selectOne(Long id) {
        return this.msgTemplateService.queryById(id);
    }

}
