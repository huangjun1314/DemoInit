package org.sang.mapper2.lectureraudit;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.config.pojo.Shunt;
import org.sang.config.pojo.user.Lecturer;
import org.sang.config.pojo.user.LecturerAudit;

import java.util.List;

@Mapper
public interface LecturerAuditMapper {

    /**
     * 多条件查询
     * @param lecturerAudit
     * @return
     */
    List<LecturerAudit> selLeturerAuditByI(LecturerAudit lecturerAudit);

    /**
     * 新增
     * @param lecturerAudit
     * @return
     */
    int updateLecturerAudit(LecturerAudit lecturerAudit);

    /**
     * 修改
     * @param lecturerAudit
     * @return
     */
    int insertLecturerAudit(LecturerAudit lecturerAudit);

    /**
     * 分润多条件查询
     * @param lecturerName 讲师名称
     * @param profitStatus 分润状态
     * @param theStartTime 开始日期
     * @param theEndOfTime 结束日期
     * @return
     */
    List<Shunt> AListOfQueries(@Param("lecturerName") String lecturerName,@Param("profitStatus") String profitStatus
            ,@Param("theStartTime") String theStartTime,@Param("theEndOfTime") String theEndOfTime);
}
