package com.key.modules.user.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

/**
 * 用户信息实体类
 */
@Data
@Table(name = "user_operator")
public class UserOperator {
    /**
     * 用户表主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 登录用户名
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 登录密码密文
     */
    @Column(name = "login_pdw")
    private String loginPdw;

    /**
     * 用户类型 1:超级用户2:普通用户，参见Constants.UserOperateType
     */
    @Column(name = "operator_type")
    private Integer operatorType;

    /**
     * 描述
     */
    private String description;

    /**
     * 昵称
     */
    @Column(name = "operator_name")
    private String operatorName;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新者
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 创建者
     */
    @Column(name = "create_by")
    private String createBy;
}