package org.sang.dao;

import org.sang.systementity.WebsiteNav;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 站点导航(WebsiteNav)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-08 10:32:42
 */
@Mapper
public interface WebsiteNavDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WebsiteNav queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WebsiteNav> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param websiteNav 实例对象
     * @return 对象列表
     */
    List<WebsiteNav> queryAll(WebsiteNav websiteNav);

    /**
     * 新增数据
     *
     * @param websiteNav 实例对象
     * @return 影响行数
     */
    int insert(WebsiteNav websiteNav);

    /**
     * 修改数据
     *
     * @param websiteNav 实例对象
     * @return 影响行数
     */
    int update(WebsiteNav websiteNav);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}
