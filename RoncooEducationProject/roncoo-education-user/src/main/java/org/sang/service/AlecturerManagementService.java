package org.sang.service;

import org.apache.ibatis.annotations.Param;
import org.sang.config.pojo.Shunt;
import org.sang.config.pojo.user.Lecturer;
import org.sang.config.pojo.user.LecturerAudit;
import org.sang.mapper2.lecturer.LeturerMapper;
import org.sang.mapper2.lectureraudit.LecturerAuditMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AlecturerManagementService {

    @Resource
    LeturerMapper leturerMapper;

    @Resource
    LecturerAuditMapper lecturerAuditMapper;

    /**
     * 多条件查询讲师信息
     * @param lecturer
     * @return
     */
    public List<Lecturer> getAllLecturerByNMS(Lecturer lecturer){
        return leturerMapper.getAllLecturerByNMS(lecturer);
    }

    /**
     * 新增讲师信息
     * @param lecturer
     * @return
     */
    public int insertLecturer(Lecturer lecturer){
        return leturerMapper.insertLecturer(lecturer);
    }

    /**
     * 修改讲师信息
     * @param lecturer
     * @return
     */
    public int updateLecturer(Lecturer lecturer){
        return leturerMapper.updateLecturer(lecturer);
    }

    /**
     * 删除讲师信息
     * @param id
     * @return
     */
    public int deleteLecturerById(Long id){
        return leturerMapper.deleteLecturerById(id);
    }


    /**
     * 多条件查询讲师信息-审核
     * @param lecturerAudit
     * @return
     */
    public List<LecturerAudit> selLeturerAuditByI(LecturerAudit lecturerAudit){
        return lecturerAuditMapper.selLeturerAuditByI(lecturerAudit);
    }

    /**
     * 新增讲师信息-审核
     * @param lecturerAudit
     * @return
     */
    public int updateLecturerAudit(LecturerAudit lecturerAudit){
        return lecturerAuditMapper.updateLecturerAudit(lecturerAudit);
    }

    /**
     * 修改讲师信息-审核
     * @param lecturerAudit
     * @return
     */
    public int insertLecturerAudit(LecturerAudit lecturerAudit){
        return lecturerAuditMapper.insertLecturerAudit(lecturerAudit);
    }

    /**
     * 分润多条件查询
     * @param lecturerName 讲师名称
     * @param profitStatus 分润状态
     * @param theStartTime 开始日期
     * @param theEndOfTime 结束日期
     * @return
     */
    public List<Shunt> AListOfQueries(@Param("lecturerName") String lecturerName, @Param("profitStatus") String profitStatus
            , @Param("theStartTime") String theStartTime, @Param("theEndOfTime") String theEndOfTime){
        return lecturerAuditMapper.AListOfQueries(lecturerName,profitStatus,theStartTime,theEndOfTime);
    }

}
