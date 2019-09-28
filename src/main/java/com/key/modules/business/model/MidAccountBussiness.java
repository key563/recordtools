package com.key.modules.business.model;

import lombok.Data;

import javax.persistence.*;

/**
 * 账号和业务单关联实体类
 */
@Data
@Table(name = "mid_account_bussiness")
public class MidAccountBussiness {
    /**
     *主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 账号id
     */
    @Column(name = "account_id")
    private Integer accountId;

    /**
     * 业务单id
     */
    @Column(name = "bussiness_id")
    private Integer bussinessId;
}