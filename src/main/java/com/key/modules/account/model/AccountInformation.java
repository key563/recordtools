package com.key.modules.account.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

/**
 * 账号信息实体类
 *
 */
@Data
@Table(name = "account_information")
public class AccountInformation {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 旺旺号
     */
    @Column(name = "account_wangwang_name")
    private String accountWangwangName;

    /**
     * 微信号
     */
    @Column(name = "account_wechat_name")
    private String accountWechatName;

    /**
     * 0:白名单1:黑名单2:骗子
     */
    @Column(name = "account_type")
    private Integer accountType;

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
     * 更改者
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 创建者
     */
    @Column(name = "create_by")
    private String createBy;

}