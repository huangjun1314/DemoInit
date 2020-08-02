package org.sang.systemservice;

import org.sang.systementity.NavBar;

import java.util.List;

/**
 * 头部导航(NavBar)表服务接口
 *
 * @author makejava
 * @since 2020-05-08 10:32:42
 */
public interface NavBarService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    NavBar queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<NavBar> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param navBar 实例对象
     * @return 实例对象
     */
    NavBar insert(NavBar navBar);

    /**
     * 修改数据
     *
     * @param navBar 实例对象
     * @return 实例对象
     */
    NavBar update(NavBar navBar);

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
     * @param navBar 实例对象
     * @return 对象列表
     */
    List<NavBar> queryAll(NavBar navBar);
}