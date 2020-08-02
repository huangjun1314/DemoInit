package org.sang.dao;

import org.sang.systementity.WebsiteNavArticle;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 站点导航文章(WebsiteNavArticle)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-08 10:32:42
 */
@Mapper
public interface WebsiteNavArticleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WebsiteNavArticle queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WebsiteNavArticle> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param websiteNavArticle 实例对象
     * @return 对象列表
     */
    List<WebsiteNavArticle> queryAll(WebsiteNavArticle websiteNavArticle);

    /**
     * 新增数据
     *
     * @param websiteNavArticle 实例对象
     * @return 影响行数
     */
    int insert(WebsiteNavArticle websiteNavArticle);

    /**
     * 修改数据
     *
     * @param websiteNavArticle 实例对象
     * @return 影响行数
     */
    int update(WebsiteNavArticle websiteNavArticle);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}
