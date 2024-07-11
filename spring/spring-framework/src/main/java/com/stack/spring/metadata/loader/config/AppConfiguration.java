package com.stack.spring.metadata.loader.config;

import com.stack.spring.metadata.loader.service.HelloWorldService;
import com.stack.spring.metadata.loader.service.HelloWorldServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Zhongxi Hu
 * @Date: 2024/07/11/14:12
 * @Description:
 */
@Configuration
public class AppConfiguration {

    @Bean
    public HelloWorldService helloWorldService() {
        return new HelloWorldServiceImpl();
    }
}
