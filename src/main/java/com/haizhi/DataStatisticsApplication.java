package com.haizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author youfeng
 */
@SpringBootApplication
@MapperScan("com.haizhi.mapper")
public class DataStatisticsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataStatisticsApplication.class, args);
    }
}
