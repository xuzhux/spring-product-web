package com.example.web;

import com.example.api.RestApi;
import com.example.api.SpringContextUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.example")
public class SpringProductWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringProductWebApplication.class, args);
//        SpringContextUtil springContextUtil = new SpringContextUtil();
//        RestApi restApi = springContextUtil.getBean("restApi");
//        restApi.rest();
    }

}
