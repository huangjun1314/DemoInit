package org.sang.course.service.impl;


import org.springframework.stereotype.Service;
import org.sang.course.dao.ZoneDao;
import org.sang.course.service.ZoneService;
import org.sang.config.pojo.course.Zone;

import javax.annotation.Resource;
import java.util.List;

/**
 * 专区(Zone)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@Service("zoneService")
public class ZoneServiceImpl implements ZoneService {
    @Resource
    private ZoneDao zoneDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Zone queryById(Long id) {
        return this.zoneDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Zone> queryAllByLimit(int offset, int limit) {
        return this.zoneDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param zone 实例对象
     * @return 实例对象
     */
    @Override
    public Zone insert(Zone zone) {
        this.zoneDao.insert(zone);
        return zone;
    }

    /**
     * 修改数据
     *
     * @param zone 实例对象
     * @return 实例对象
     */
    @Override
    public Zone update(Zone zone) {
        this.zoneDao.update(zone);
        return this.queryById(zone.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.zoneDao.deleteById(id) > 0;
    }

    @Override
    public List<Zone> queryAll(Zone zone) {
        return this.zoneDao.queryAll(zone);
    }
}