package org.sang.course.service.impl;


import org.springframework.stereotype.Service;
import org.sang.course.dao.ZoneCourseDao;
import org.sang.course.service.ZoneCourseService;
import org.sang.config.pojo.course.ZoneCourse;

import javax.annotation.Resource;
import java.util.List;

/**
 * 专区课程关联表(ZoneCourse)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@Service("zoneCourseService")
public class ZoneCourseServiceImpl implements ZoneCourseService {
    @Resource
    private ZoneCourseDao zoneCourseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ZoneCourse queryById(Long id) {
        return this.zoneCourseDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ZoneCourse> queryAllByLimit(int offset, int limit) {
        return this.zoneCourseDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param zoneCourse 实例对象
     * @return 实例对象
     */
    @Override
    public ZoneCourse insert(ZoneCourse zoneCourse) {
        this.zoneCourseDao.insert(zoneCourse);
        return zoneCourse;
    }

    /**
     * 修改数据
     *
     * @param zoneCourse 实例对象
     * @return 实例对象
     */
    @Override
    public ZoneCourse update(ZoneCourse zoneCourse) {
        this.zoneCourseDao.update(zoneCourse);
        return this.queryById(zoneCourse.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.zoneCourseDao.deleteById(id) > 0;
    }

    @Override
    public List<ZoneCourse> queryAll(ZoneCourse zoneCourse) {
        return this.zoneCourseDao.queryAll(zoneCourse);
    }
}