package com.sunyur.purchaser.service;

import com.sunyur.common.pagination.ModelResult;
import com.sunyur.purchaser.model.PurchaseApplyClassModel;

/**
 * Copyright(c) 2018 Sunyur.com, All Rights Reserved.
 * Project: sy
 * Author: yuanjiamin
 * CreateDate: 2020/11/23 11:51 上午
 * Description: 采购申请查询
 */
public interface PurchaseApplyClassQueryService {
    /**
     * @param purchaseApplyClassModel:
     * @return
     * @Description: 通过参数查询单条采购申请记录
     * @author yuanjiamin
     * @date 2020/11/23 12:00 下午
     */
    ModelResult<PurchaseApplyClassModel> getByParam(PurchaseApplyClassModel purchaseApplyClassModel);
    /**
     * @param purchaseApplyClassModel:
     * @return
     * @Description: 添加单条采购申请记录
     * @author yuanjiamin
     * @date 2020/11/24 3:26 下午
     */
    ModelResult<Boolean> add(PurchaseApplyClassModel purchaseApplyClassModel);

    /**
     * @param purchaseApplyClassModel:
     * @return
     * @Description: 删除单条采购申请记录
     * @author yuanjiamin
     * @date 2020/11/24 4:01 下午
     */
    ModelResult<Boolean> deleteByParam(PurchaseApplyClassModel purchaseApplyClassModel);
}
