package org.sang.course.service.impl;


import org.springframework.stereotype.Service;
import org.sang.course.dao.CourseIntroduceDao;
import org.sang.course.service.CourseIntroduceService;
import org.sang.config.pojo.course.CourseIntroduce;

import javax.annotation.Resource;
import java.util.List;

/**
 * 课程介绍信息(CourseIntroduce)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
@Service("courseIntroduceService")
public class CourseIntroduceServiceImpl implements CourseIntroduceService {
    @Resource
    private CourseIntroduceDao courseIntroduceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CourseIntroduce queryById(Long id) {
        return this.courseIntroduceDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CourseIntroduce> queryAllByLimit(int offset, int limit) {
        return this.courseIntroduceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param courseIntroduce 实例对象
     * @return 实例对象
     */
    @Override
    public CourseIntroduce insert(CourseIntroduce courseIntroduce) {
        this.courseIntroduceDao.insert(courseIntroduce);
        return courseIntroduce;
    }

    /**
     * 修改数据
     *
     * @param courseIntroduce 实例对象
     * @return 实例对象
     */
    @Override
    public CourseIntroduce update(CourseIntroduce courseIntroduce) {
        this.courseIntroduceDao.update(courseIntroduce);
        return this.queryById(courseIntroduce.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.courseIntroduceDao.deleteById(id) > 0;
    }
}