package org.sang.systemservice.impl;

import org.sang.dao.WebsiteNavArticleDao;
import org.sang.systementity.WebsiteNavArticle;
import org.sang.systemservice.WebsiteNavArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 站点导航文章(WebsiteNavArticle)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:32:42
 */
@Service("websiteNavArticleService")
public class WebsiteNavArticleServiceImpl implements WebsiteNavArticleService {
    @Resource
    private WebsiteNavArticleDao websiteNavArticleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WebsiteNavArticle queryById(Long id) {
        return this.websiteNavArticleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WebsiteNavArticle> queryAllByLimit(int offset, int limit) {
        return this.websiteNavArticleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param websiteNavArticle 实例对象
     * @return 实例对象
     */
    @Override
    public WebsiteNavArticle insert(WebsiteNavArticle websiteNavArticle) {
        this.websiteNavArticleDao.insert(websiteNavArticle);
        return websiteNavArticle;
    }

    /**
     * 修改数据
     *
     * @param websiteNavArticle 实例对象
     * @return 实例对象
     */
    @Override
    public WebsiteNavArticle update(WebsiteNavArticle websiteNavArticle) {
        this.websiteNavArticleDao.update(websiteNavArticle);
        return this.queryById(websiteNavArticle.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.websiteNavArticleDao.deleteById(id) > 0;
    }

    @Override
    public List<WebsiteNavArticle> queryAll(WebsiteNavArticle websiteNavArticle) {
        return this.websiteNavArticleDao.queryAll(websiteNavArticle);
    }
}