package com.sunyur.purchaser.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Copyright(c) 2018 Sunyur.com, All Rights Reserved.
 * Project: sy
 * Author: yuanjiamin
 * CreateDate: 2020/11/23 11:19 上午
 * Description: 采购申请类
 */
public class PurchaseApplyClassModel implements Serializable {
    private static final long serialVersionUID = -3830665066525471310L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 公司主体
     */
    private Long purchaseComanyId;
    /**
     * 公司主体名称
     */
    private String purchaseCompanyName;
    /**
     * 公司主体code
     */
    private String purchaseCompanyCode;

    /**
     * 创建时间
     */
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPurchaseComanyId() {
        return purchaseComanyId;
    }

    public void setPurchaseComanyId(Long purchaseComanyId) {
        this.purchaseComanyId = purchaseComanyId;
    }

    public String getPurchaseCompanyName() {
        return purchaseCompanyName;
    }

    public void setPurchaseCompanyName(String purchaseCompanyName) {
        this.purchaseCompanyName = purchaseCompanyName;
    }

    public String getPurchaseCompanyCode() {
        return purchaseCompanyCode;
    }

    public void setPurchaseCompanyCode(String purchaseCompanyCode) {
        this.purchaseCompanyCode = purchaseCompanyCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "PurchaseApplyClassModel{" +
                "id=" + id +
                ", purchaseComanyId=" + purchaseComanyId +
                ", purchaseCompanyName='" + purchaseCompanyName + '\'' +
                ", purchaseCompanyCode='" + purchaseCompanyCode + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
