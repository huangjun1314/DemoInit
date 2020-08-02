package org.sang.config.pojo.system.vo;


import java.io.Serializable;
import java.util.Date;

/**
 * 角色信息
 *
 * @author wujing
 */
public class SysRoleVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;
    /**
     * 状态(1:正常，0:禁用)
     */
    private Integer statusId;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 名称
     */
    private String name;
    /**
     * 备注
     */
    private String nameZh;

}
