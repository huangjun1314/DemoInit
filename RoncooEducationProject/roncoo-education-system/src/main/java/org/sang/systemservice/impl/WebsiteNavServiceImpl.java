package org.sang.systemservice.impl;

import org.sang.dao.WebsiteNavDao;
import org.sang.systementity.WebsiteNav;
import org.sang.systemservice.WebsiteNavService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 站点导航(WebsiteNav)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:32:42
 */
@Service("websiteNavService")
public class WebsiteNavServiceImpl implements WebsiteNavService {
    @Resource
    private WebsiteNavDao websiteNavDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WebsiteNav queryById(Long id) {
        return this.websiteNavDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WebsiteNav> queryAllByLimit(int offset, int limit) {
        return this.websiteNavDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param websiteNav 实例对象
     * @return 实例对象
     */
    @Override
    public WebsiteNav insert(WebsiteNav websiteNav) {
        this.websiteNavDao.insert(websiteNav);
        return websiteNav;
    }

    /**
     * 修改数据
     *
     * @param websiteNav 实例对象
     * @return 实例对象
     */
    @Override
    public WebsiteNav update(WebsiteNav websiteNav) {
        this.websiteNavDao.update(websiteNav);
        return this.queryById(websiteNav.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.websiteNavDao.deleteById(id) > 0;
    }

    @Override
    public List<WebsiteNav> queryAll(WebsiteNav websiteNav) {
        return this.websiteNavDao.queryAll(websiteNav);
    }
}