package org.sang.mapper2.lecturer;

import org.apache.ibatis.annotations.Mapper;
import org.sang.config.pojo.user.Lecturer;

import java.util.List;

@Mapper
public interface LeturerMapper {

    /**
     * 多条件查询
     * @param lecturer
     * @return
     */
    List<Lecturer> getAllLecturerByNMS(Lecturer lecturer);

    /**
     * 新增
     * @param lecturer
     * @return
     */
    int insertLecturer(Lecturer lecturer);

    /**
     * 修改
     * @param lecturer
     * @return
     */
    int updateLecturer(Lecturer lecturer);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteLecturerById(Long id);


}
