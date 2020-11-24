package com.sunyur;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ImportResource({"classpath:xml_config/*.xml"})
@EnableTransactionManagement
@MapperScan(value = "com.sunyur.**.dao")
@ComponentScan("com.sunyur.*")
@SpringBootApplication
public class DemoCenterStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCenterStartApplication.class, args);
        System.out.println("hello word!");
    }

}
