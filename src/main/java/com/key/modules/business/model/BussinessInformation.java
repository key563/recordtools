package com.key.modules.business.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

/**
 * 业务单实体类
 */
@Data
@Table(name = "bussiness_information")
public class BussinessInformation {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 业务单号
     */
    @Column(name = "bussiness_id")
    private String bussinessId;

    /**
     * 店铺名称
     */
    @Column(name = "store_name")
    private String storeName;

    /**
     * 购买金额
     */
    @Column(name = "pay_money")
    private Float payMoney;

    /**
     * 佣金
     */
    @Column(name = "commission_momey")
    private Float commissionMomey;

    /**
     * 成本价:购买金额+佣金
     */
    @Column(name = "cost_price")
    private Float costPrice;

    /**
     * 购买时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 业务单描述
     */
    @Column(name = "bussiness_decsription")
    private String bussinessDecsription;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新者
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建者
     */
    @Column(name = "create_by")
    private String createBy;
}