package org.sang.mapper2.userext;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.config.pojo.user.UserExt;

import java.util.List;

@Mapper
public interface UserExtMapper {

    /**
     * 多条件查询学员信息
     * @param mobile 用户手机号
     * @param nickname 昵称
     * @param statusId 状态
     * @param theStartTime 注册开始时间
     * @param theEndOfTime 注册结束时间
     * @return
     */
    List<UserExt> selUserExtMapBI(@Param("mobile") String mobile,@Param("nickname") String nickname
            ,@Param("statusId") String statusId,@Param("theStartTime") String theStartTime
            ,@Param("theEndOfTime") String theEndOfTime);

    /**
     * 修改学员信息
     * @param userExt
     * @return
     */
    int updateUserExt(UserExt userExt);
}
