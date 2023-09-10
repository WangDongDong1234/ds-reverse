package com.ds.reverse;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScans({@MapperScan("com.ds.reverse.mapper")})
@SpringBootApplication
public class DsReverseApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsReverseApplication.class, args);
    }

}
