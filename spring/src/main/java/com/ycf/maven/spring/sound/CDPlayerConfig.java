package com.ycf.maven.spring.sound;

import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

@Configuration
@ImportResource("classpath:context.xml")
// @ComponentScan //默认扫描与配置类相同的包
// @ComponentScan("com.ycf.maven.spring.sound") // 显示指定基础包
// @ComponentScan(basePackages = "com.ycf.maven.spring.sound") // 显示指定基础包
// @ComponentScan(basePackages = { "com.ycf.maven.spring.sound", "..." }) //
// 显示指定多个基础包,
// @ComponentScan(basePackageClasses = {SgtPeppers.class, CompactDisc.class}) //
// @Profile("dev") //配置类中的bean只有在指定profile激活时才会被创建
public class CDPlayerConfig {

    // @Bean /* 借助JavaConfig实现注入 bean ID默认为方法名*/
    @Bean("compactDisc")
    @Profile("dev") //配置类中的bean只有在指定profile激活时才会被创建
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }
}