package com.sunyur.purchaser.service.remote;

import com.alibaba.fastjson.JSON;
import com.sunyur.common.pagination.ModelResult;
import com.sunyur.purchaser.dao.PurchaseApplyClassDAO;
import com.sunyur.purchaser.model.PurchaseApplyClassDO;
import com.sunyur.purchaser.model.PurchaseApplyClassModel;
import com.sunyur.purchaser.service.PurchaseApplyClassQueryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Copyright(c) 2018 Sunyur.com, All Rights Reserved.
 * Project: sy
 * Author: yuanjiamin
 * CreateDate: 2020/11/23 2:58 下午
 * Description:
 */
@Service("purchaseApplyClassQueryService")
public class PurchaseApplyClassQueryServiceImpl implements PurchaseApplyClassQueryService {

    private final static Logger LOGGER_INFO = LoggerFactory.getLogger(PurchaseApplyClassQueryServiceImpl.class);
    private final static Logger LOGGER_ERROR = LoggerFactory.getLogger(PurchaseApplyClassQueryServiceImpl.class);

    @Resource
    private PurchaseApplyClassDAO purchaseApplyClassDAO;

    /**
     * @param purchaseApplyClassModel:
     * @return
     * @Description: 通过参数查询单条收货记录
     * @author yuanjiamin
     * @date 2020/11/23 12:00 下午
     */
    @Override
    public ModelResult<PurchaseApplyClassModel> getByParam(PurchaseApplyClassModel purchaseApplyClassModel) {
        LOGGER_INFO.info("getByParam platformMessageModel {}", JSON.toJSONString(purchaseApplyClassModel));
        ModelResult<PurchaseApplyClassModel> result = new ModelResult<>();
        try {
            //Mo->Do
            PurchaseApplyClassDO purchaseApplyClassDO = new PurchaseApplyClassDO();
            purchaseApplyClassDO.setId(purchaseApplyClassModel.getId());
            PurchaseApplyClassDO resultDo = purchaseApplyClassDAO.getByParam(purchaseApplyClassDO);
            //Do->Mo
            PurchaseApplyClassModel resultMo = new PurchaseApplyClassModel();
            BeanUtils.copyProperties(resultDo, resultMo);
            result.setContent(resultMo);
        } catch (BeansException e) {
            LOGGER_ERROR.error("getByParam is Exception param:{},err:{}", JSON.toJSONString(purchaseApplyClassModel), e.getMessage());
            result.setErrorMessage("system.exception", e.getMessage());
        }
        return result;
    }

    /**
     * @param purchaseApplyClassModel:
     * @return
     * @Description: 添加单条采购申请记录
     * @author yuanjiamin
     * @date 2020/11/24 3:26 下午
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public ModelResult<Boolean> add(PurchaseApplyClassModel purchaseApplyClassModel) {
        LOGGER_INFO.info("add param purchaseApplyClassModel {}", JSON.toJSONString(purchaseApplyClassModel));
        ModelResult<Boolean> result = new ModelResult<>();
        result.setContent(false);
        try {
            PurchaseApplyClassDO purchaseApplyClassDO = new PurchaseApplyClassDO();
            BeanUtils.copyProperties(purchaseApplyClassModel, purchaseApplyClassDO);
            purchaseApplyClassDAO.insert(purchaseApplyClassDO);
            result.setContent(true);
        } catch (Exception e) {
            LOGGER_ERROR.error("add is exception {}", e);
            result.setErrorMessage("system.exception", e.getMessage());
            //抛出异常，让事物处理
            throw e;
        }
        return result;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ModelResult<Boolean> deleteByParam(PurchaseApplyClassModel purchaseApplyClassModel) {
        LOGGER_INFO.info("delete param purchaseApplyClassModel {}", JSON.toJSONString(purchaseApplyClassModel));
        ModelResult<Boolean> result = new ModelResult<>();
        result.setContent(false);
        try {
            PurchaseApplyClassDO purchaseApplyClassDO = new PurchaseApplyClassDO();
            BeanUtils.copyProperties(purchaseApplyClassModel, purchaseApplyClassDO);
            Integer delete = purchaseApplyClassDAO.delete(purchaseApplyClassDO);
            if (delete == 1) {
                result.setContent(true);
            }
        } catch (Exception e) {
            LOGGER_ERROR.error("delete is exception {}", e);
            result.setErrorMessage("system.exception", e.getMessage());
            //抛出异常，让事物处理
            throw e;
        }
        return result;
    }
}
