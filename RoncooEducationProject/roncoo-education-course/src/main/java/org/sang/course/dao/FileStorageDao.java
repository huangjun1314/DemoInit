package org.sang.course.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.config.pojo.course.FileStorage;

import java.util.List;

/**
 * 文件存储表(FileStorage)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@Mapper
public interface FileStorageDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FileStorage queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<FileStorage> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param fileStorage 实例对象
     * @return 对象列表
     */
    List<FileStorage> queryAll(FileStorage fileStorage);

    /**
     * 新增数据
     *
     * @param fileStorage 实例对象
     * @return 影响行数
     */
    int insert(FileStorage fileStorage);

    /**
     * 修改数据
     *
     * @param fileStorage 实例对象
     * @return 影响行数
     */
    int update(FileStorage fileStorage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}
