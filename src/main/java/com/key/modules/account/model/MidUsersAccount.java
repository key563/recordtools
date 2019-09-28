package com.key.modules.account.model;

import lombok.Data;

import javax.persistence.*;

/**
 * 账号和用户关联实体类
 */
@Data
@Table(name = "mid_users_account")
public class MidUsersAccount {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户表主键
     */
    @Column(name = "users_id")
    private Integer usersId;

    /**
     * 账号表主键
     */
    @Column(name = "account_id")
    private Integer accountId;
}