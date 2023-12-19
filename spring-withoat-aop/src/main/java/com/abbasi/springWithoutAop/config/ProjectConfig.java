package com.abbasi.springWithoutAop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.abbasi.springWithoutAop.model", "com.abbasi.springWithoutAop.service"})
public class ProjectConfig {
}
