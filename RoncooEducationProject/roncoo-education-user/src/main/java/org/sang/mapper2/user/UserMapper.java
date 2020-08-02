package org.sang.mapper2.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.entity.PlatForm;
import org.sang.entity.User;

@Mapper
public interface UserMapper {

    /**
     * 根据手机号查询用户基本信息
     * @param mobile
     * @return
     */
    User loadUserByUsername(@Param("mobile") String mobile);

    /**
     * 根据手机号修改密码
     * @param mobilePsw 密码
     * @param mobile 手机号
     * @return
     */
    int modifyUserByMobile(@Param("mobilePsw") String mobilePsw,@Param("mobile") String mobile);

    /**
     * 新增用户信息
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 查询平台信息
     * @return
     */
    PlatForm selPlatForm();

    /**
     * 根据手机号删除
     * @param mobile
     * @return
     */
    int delUserByMobile(@Param("mobile") String mobile);

}
