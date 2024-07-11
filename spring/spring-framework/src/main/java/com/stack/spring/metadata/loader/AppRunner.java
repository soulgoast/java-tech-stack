package com.stack.spring.metadata.loader;

import com.stack.spring.metadata.loader.config.AppConfiguration;
import com.stack.spring.metadata.loader.service.HelloWorldService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Zhongxi Hu
 * @Date: 2024/07/11/14:04
 * @Description:
 */
public class AppRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        HelloWorldService helloWorldService = context.getBean(HelloWorldService.class);
        helloWorldService.sayHello();
    }

}
