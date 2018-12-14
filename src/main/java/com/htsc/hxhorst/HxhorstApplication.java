package com.htsc.hxhorst;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.htsc")
@MapperScan("com.htsc.hxhorst.mapper")
public class HxhorstApplication {

    public static void main(String[] args) {
        SpringApplication.run(HxhorstApplication.class, args);
    }
}
