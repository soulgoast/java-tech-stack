package com.stack.spring.metadata.loader.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Zhongxi Hu
 * @Date: 2024/07/11/17:33
 * @Description:
 */
@Configuration
public class CglibEnhancerConfiguration {

    private int counter;

    @Bean
    public String something() {
        return String.valueOf(++counter);
    }

}
