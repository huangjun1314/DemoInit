package org.sang.systemservice;

import org.sang.systementity.WebsiteNavArticle;

import java.util.List;

/**
 * 站点导航文章(WebsiteNavArticle)表服务接口
 *
 * @author makejava
 * @since 2020-05-08 10:32:42
 */
public interface WebsiteNavArticleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WebsiteNavArticle queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WebsiteNavArticle> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param websiteNavArticle 实例对象
     * @return 实例对象
     */
    WebsiteNavArticle insert(WebsiteNavArticle websiteNavArticle);

    /**
     * 修改数据
     *
     * @param websiteNavArticle 实例对象
     * @return 实例对象
     */
    WebsiteNavArticle update(WebsiteNavArticle websiteNavArticle);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param websiteNavArticle 实例对象
     * @return 对象列表
     */
    List<WebsiteNavArticle> queryAll(WebsiteNavArticle websiteNavArticle);

}