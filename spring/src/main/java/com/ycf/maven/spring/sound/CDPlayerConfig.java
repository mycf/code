package com.ycf.maven.spring.sound;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan //默认扫描与配置类相同的包
// @ComponentScan("com.ycf.maven.spring.sound") // 显示指定基础包
// @ComponentScan(basePackages = "com.ycf.maven.spring.sound") // 显示指定基础包
// @ComponentScan(basePackages = { "com.ycf.maven.spring.sound", "..." }) // 显示指定多个基础包,
// @ComponentScan(basePackageClasses = {SgtPeppers.class, CompactDisc.class}) // 
public class CDPlayerConfig {

}