package com.abbasi.springAopAround.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.abbasi.springAopAround.model", "com.abbasi.springAopAround.service", "com.abbasi.springAopAround.aspect"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
