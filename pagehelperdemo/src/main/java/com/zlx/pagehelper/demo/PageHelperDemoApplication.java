package com.zlx.pagehelper.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zlx.pagehelper.demo.mapper")
public class PageHelperDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PageHelperDemoApplication.class, args);
    }

}
