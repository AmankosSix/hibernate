package com.amankos.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.amankos")
@PropertySource("classpath:myApp.properties")
@EnableAspectJAutoProxy
public class MyConfig {
}
