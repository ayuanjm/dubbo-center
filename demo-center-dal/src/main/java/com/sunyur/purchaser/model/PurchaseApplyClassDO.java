package com.sunyur.purchaser.model;


import java.io.Serializable;

/**
 * Copyright(c) 2018 Sunyur.com, All Rights Reserved.
 * Project: sy
 * Author: yuanjiamin
 * CreateDate: 2020/11/23 2:44 下午
 * Description: 采购申请查询java类
 */
public class PurchaseApplyClassDO implements Serializable {
    private static final long serialVersionUID = 5377610531527238906L;
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

    @Override
    public String toString() {
        return "PurchaseApplyClassDO{" +
                "id=" + id +
                ", purchaseComanyId=" + purchaseComanyId +
                ", purchaseCompanyName='" + purchaseCompanyName + '\'' +
                ", purchaseCompanyCode='" + purchaseCompanyCode + '\'' +
                '}';
    }
}
