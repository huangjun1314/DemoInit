package org.sang.systemservice.impl;

import org.sang.dao.MsgTemplateDao;
import org.sang.systementity.MsgTemplate;
import org.sang.systemservice.MsgTemplateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 消息模板(MsgTemplate)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:32:41
 */
@Service("msgTemplateService")
public class MsgTemplateServiceImpl implements MsgTemplateService {
    @Resource
    private MsgTemplateDao msgTemplateDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MsgTemplate queryById(Long id) {
        return this.msgTemplateDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<MsgTemplate> queryAllByLimit(int offset, int limit) {
        return this.msgTemplateDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param msgTemplate 实例对象
     * @return 实例对象
     */
    @Override
    public MsgTemplate insert(MsgTemplate msgTemplate) {
        this.msgTemplateDao.insert(msgTemplate);
        return msgTemplate;
    }

    /**
     * 修改数据
     *
     * @param msgTemplate 实例对象
     * @return 实例对象
     */
    @Override
    public MsgTemplate update(MsgTemplate msgTemplate) {
        this.msgTemplateDao.update(msgTemplate);
        return this.queryById(msgTemplate.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.msgTemplateDao.deleteById(id) > 0;
    }
}