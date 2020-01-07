package com.mycompany.app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.mycompany.app")
public class JavaConfig {

    @Bean
    @Scope("prototype")
    public Circle circle()
    {
        return  new Circle();
    }
}
