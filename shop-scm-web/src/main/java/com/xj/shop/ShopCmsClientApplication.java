package com.xj.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication( scanBasePackages = "com.xj.shop" )
public class ShopCmsClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopCmsClientApplication.class, args);
    }
}