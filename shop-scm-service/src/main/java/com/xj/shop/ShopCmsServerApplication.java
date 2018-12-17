package com.xj.shop;

import com.alibaba.dubbo.container.Main;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication( scanBasePackages = "com.xj.shop" )
@EnableTransactionManagement
@MapperScan( basePackages = "com.xj.shop" )
public class ShopCmsServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopCmsServerApplication.class, args);
        Main.main(args);
    }
}
