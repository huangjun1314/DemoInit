package org.sang.systemservice.impl;

import org.sang.dao.NavBarDao;
import org.sang.systementity.NavBar;
import org.sang.systemservice.NavBarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 头部导航(NavBar)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:32:42
 */
@Service("navBarService")
public class NavBarServiceImpl implements NavBarService {
    @Resource
    private NavBarDao navBarDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public NavBar queryById(Long id) {
        return this.navBarDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<NavBar> queryAllByLimit(int offset, int limit) {
        return this.navBarDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param navBar 实例对象
     * @return 实例对象
     */
    @Override
    public NavBar insert(NavBar navBar) {
        this.navBarDao.insert(navBar);
        return navBar;
    }

    /**
     * 修改数据
     *
     * @param navBar 实例对象
     * @return 实例对象
     */
    @Override
    public NavBar update(NavBar navBar) {
        this.navBarDao.update(navBar);
        return this.queryById(navBar.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.navBarDao.deleteById(id) > 0;
    }

    @Override
    public List<NavBar> queryAll(NavBar navBar) {
        return this.navBarDao.queryAll(navBar);
    }


}