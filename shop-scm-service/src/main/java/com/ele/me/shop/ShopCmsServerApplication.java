package com.ele.me.shop;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication( scanBasePackages = "com.ele.me.shop" )
@EnableTransactionManagement
@MapperScan( basePackages = "com.ele.me.shop" )
@EnableDubbo
public class ShopCmsServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopCmsServerApplication.class, args);
    }
}
