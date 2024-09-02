package com.stack.spring.metadata.loader;

import com.stack.spring.metadata.loader.config.AppConfiguration;
import com.stack.spring.metadata.loader.config.CglibEnhancerConfiguration;
import com.stack.spring.metadata.loader.service.HelloWorldService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Zhongxi Hu
 * @Date: 2024/07/11/14:04
 * @Description:
 */
public class AppRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class, CglibEnhancerConfiguration.class);
        HelloWorldService helloWorldService = context.getBean(HelloWorldService.class);
        helloWorldService.sayHello();

        CglibEnhancerConfiguration cglibEnhancerConfiguration = context.getBean(CglibEnhancerConfiguration.class);
        System.out.println(cglibEnhancerConfiguration.something());
        System.out.println(cglibEnhancerConfiguration.something());
    }

}
