package com.xc.xc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cssl.mapper")
public class XcApplication {

    public static void main(String[] args) {
        SpringApplication.run(XcApplication.class, args);
    }

}
