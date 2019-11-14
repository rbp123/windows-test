package com.hs.bi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@MapperScan("com.hs.bi.mapper")
@SpringBootApplication
public class BusinessIntelligenceShowApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusinessIntelligenceShowApplication.class, args);
    }
}
