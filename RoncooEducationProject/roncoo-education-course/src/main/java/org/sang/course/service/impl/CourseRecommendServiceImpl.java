package org.sang.course.service.impl;


import org.springframework.stereotype.Service;
import org.sang.course.dao.CourseRecommendDao;
import org.sang.course.service.CourseRecommendService;
import org.sang.config.pojo.course.CourseRecommend;

import javax.annotation.Resource;
import java.util.List;

/**
 * 课程推荐(CourseRecommend)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@Service("courseRecommendService")
public class CourseRecommendServiceImpl implements CourseRecommendService {
    @Resource
    private CourseRecommendDao courseRecommendDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CourseRecommend queryById(Long id) {
        return this.courseRecommendDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CourseRecommend> queryAllByLimit(int offset, int limit) {
        return this.courseRecommendDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param courseRecommend 实例对象
     * @return 实例对象
     */
    @Override
    public CourseRecommend insert(CourseRecommend courseRecommend) {
        this.courseRecommendDao.insert(courseRecommend);
        return courseRecommend;
    }

    /**
     * 修改数据
     *
     * @param courseRecommend 实例对象
     * @return 实例对象
     */
    @Override
    public CourseRecommend update(CourseRecommend courseRecommend) {
        this.courseRecommendDao.update(courseRecommend);
        return this.queryById(courseRecommend.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.courseRecommendDao.deleteById(id) > 0;
    }
}