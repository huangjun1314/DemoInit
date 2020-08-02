package org.sang.course.service;


import org.sang.config.pojo.course.DicList;

import java.util.List;

/**
 * 数据字典明细表(DicList)表服务接口
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
public interface DicListService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DicList queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DicList> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param dicList 实例对象
     * @return 实例对象
     */
    DicList insert(DicList dicList);

    /**
     * 修改数据
     *
     * @param dicList 实例对象
     * @return 实例对象
     */
    DicList update(DicList dicList);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}