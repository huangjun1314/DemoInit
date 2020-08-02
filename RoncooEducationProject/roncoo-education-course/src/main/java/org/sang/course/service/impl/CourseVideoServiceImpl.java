package org.sang.course.service.impl;


import org.springframework.stereotype.Service;
import org.sang.course.dao.CourseVideoDao;
import org.sang.course.service.CourseVideoService;
import org.sang.config.pojo.course.CourseVideo;

import javax.annotation.Resource;
import java.util.List;

/**
 * 课程视频信息(CourseVideo)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@Service("courseVideoService")
public class CourseVideoServiceImpl implements CourseVideoService {
    @Resource
    private CourseVideoDao courseVideoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CourseVideo queryById(Long id) {
        return this.courseVideoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CourseVideo> queryAllByLimit(int offset, int limit) {
        return this.courseVideoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param courseVideo 实例对象
     * @return 实例对象
     */
    @Override
    public CourseVideo insert(CourseVideo courseVideo) {
        this.courseVideoDao.insert(courseVideo);
        return courseVideo;
    }

    /**
     * 修改数据
     *
     * @param courseVideo 实例对象
     * @return 实例对象
     */
    @Override
    public CourseVideo update(CourseVideo courseVideo) {
        this.courseVideoDao.update(courseVideo);
        return this.queryById(courseVideo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.courseVideoDao.deleteById(id) > 0;
    }
}