package com.abbasi.springWithoutAOP.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.abbasi.springWithoutAOP.model","com.abbasi.springWithoutAOP.service"})
public class ProjectConfig {
}
