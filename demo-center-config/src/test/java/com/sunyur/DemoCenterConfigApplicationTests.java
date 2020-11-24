package com.sunyur;

import com.sunyur.common.pagination.ModelResult;
import com.sunyur.purchaser.model.PurchaseApplyClassModel;
import com.sunyur.purchaser.service.PurchaseApplyClassQueryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DemoCenterConfigApplicationTests {
    @Autowired
    private ApplicationContext ioc;

    @Test
    void contextLoads() {
        PurchaseApplyClassQueryService bean = ioc.getBean(PurchaseApplyClassQueryService.class);
        System.out.println(bean);
        PurchaseApplyClassModel purchaseApplyClassModel = new PurchaseApplyClassModel();
        purchaseApplyClassModel.setId(20L);
        ModelResult<PurchaseApplyClassModel> byParam = bean.getByParam(purchaseApplyClassModel);
    }

}
