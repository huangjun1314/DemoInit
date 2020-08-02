package org.sang.service;

import org.apache.ibatis.annotations.Param;
import org.sang.config.pojo.user.UserExt;
import org.sang.mapper2.userext.UserExtMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentManagementService {

    @Resource
    UserExtMapper userExtMapper;

    /**
     * 多条件查询学员信息
     * @param mobile 用户手机号
     * @param nickname 昵称
     * @param statusId 状态
     * @param theStartTime 注册开始时间
     * @param theEndOfTime 注册结束时间
     * @return
     */
    public List<UserExt> selUserExtMapBI(@Param("mobile") String mobile, @Param("nickname") String nickname
            , @Param("statusId") String statusId, @Param("theStartTime") String theStartTime
            , @Param("theEndOfTime") String theEndOfTime){
        return userExtMapper.selUserExtMapBI(mobile,nickname,statusId,theStartTime,theEndOfTime);
    }

    /**
     * 修改学员信息
     * @param userExt
     * @return
     */
    public int updateUserExt(UserExt userExt){
        return userExtMapper.updateUserExt(userExt);
    }

}
