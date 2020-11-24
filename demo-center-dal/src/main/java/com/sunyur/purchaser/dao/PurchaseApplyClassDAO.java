package com.sunyur.purchaser.dao;

import com.sunyur.purchaser.model.PurchaseApplyClassDO;
import org.apache.ibatis.annotations.Param;

/**
 * Copyright(c) 2018 Sunyur.com, All Rights Reserved.
 * Project: sy
 * Author: yuanjiamin
 * CreateDate: 2020/11/23 2:44 下午
 * Description: 采购申请查询 mapper
 */
public interface PurchaseApplyClassDAO {
    /**
     * @param purchaseApplyClassDO:
     * @return
     * @Description: 条件查询单个
     * @author yuanjiamin
     * @date 2020/11/23 2:48 下午
     */
    PurchaseApplyClassDO getByParam(@Param("bean") PurchaseApplyClassDO purchaseApplyClassDO);
    
    /**
     * @Description:
     * @author yuanjiamin
     * @date 2020/11/24 3:38 下午
     * @param purchaseApplyClassDO: 
     * @return        
     */
    Integer insert(@Param("bean") PurchaseApplyClassDO purchaseApplyClassDO);

    /**
     * @Description:
     * @author yuanjiamin
     * @date 2020/11/24 3:38 下午
     * @param purchaseApplyClassDO:
     * @return
     */
    Integer delete(@Param("bean") PurchaseApplyClassDO purchaseApplyClassDO);
}
