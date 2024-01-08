package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//java based bean configuration (Dependency Injection)
@Configuration
@ComponentScan(basePackages = "com.example")
public class BeanConfig {

    @Bean
    public Manager manager()
    {
        return new Manager();
    }

}
