package com.ele.me.shop;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication( scanBasePackages = "com.xj.shop" )
@EnableDubbo
public class ShopCmsClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopCmsClientApplication.class, args);
    }
}