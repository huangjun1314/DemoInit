package org.sang.course.service.impl;


import org.springframework.stereotype.Service;
import org.sang.course.dao.DicListDao;
import org.sang.course.service.DicListService;
import org.sang.config.pojo.course.DicList;

import javax.annotation.Resource;
import java.util.List;

/**
 * 数据字典明细表(DicList)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@Service("dicListService")
public class DicListServiceImpl implements DicListService {
    @Resource
    private DicListDao dicListDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DicList queryById(Long id) {
        return this.dicListDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DicList> queryAllByLimit(int offset, int limit) {
        return this.dicListDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param dicList 实例对象
     * @return 实例对象
     */
    @Override
    public DicList insert(DicList dicList) {
        this.dicListDao.insert(dicList);
        return dicList;
    }

    /**
     * 修改数据
     *
     * @param dicList 实例对象
     * @return 实例对象
     */
    @Override
    public DicList update(DicList dicList) {
        this.dicListDao.update(dicList);
        return this.queryById(dicList.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.dicListDao.deleteById(id) > 0;
    }
}