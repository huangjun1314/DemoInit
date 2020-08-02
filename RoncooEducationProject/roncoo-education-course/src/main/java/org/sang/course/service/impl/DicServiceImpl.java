package org.sang.course.service.impl;


import org.springframework.stereotype.Service;
import org.sang.course.dao.DicDao;
import org.sang.course.service.DicService;
import org.sang.config.pojo.course.Dic;

import javax.annotation.Resource;
import java.util.List;

/**
 * 数据字典(Dic)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@Service("dicService")
public class DicServiceImpl implements DicService {
    @Resource
    private DicDao dicDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Dic queryById(Long id) {
        return this.dicDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Dic> queryAllByLimit(int offset, int limit) {
        return this.dicDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param dic 实例对象
     * @return 实例对象
     */
    @Override
    public Dic insert(Dic dic) {
        this.dicDao.insert(dic);
        return dic;
    }

    /**
     * 修改数据
     *
     * @param dic 实例对象
     * @return 实例对象
     */
    @Override
    public Dic update(Dic dic) {
        this.dicDao.update(dic);
        return this.queryById(dic.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.dicDao.deleteById(id) > 0;
    }
}