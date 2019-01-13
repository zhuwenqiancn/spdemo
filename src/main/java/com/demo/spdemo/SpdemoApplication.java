package com.demo.spdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.demo.spdemo.dao")
public class SpdemoApplication {


    public static void main(String[] args) {


        SpringApplication.run(
                SpdemoApplication.class, args);
    }

}

