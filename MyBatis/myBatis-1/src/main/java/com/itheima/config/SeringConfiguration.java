package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 这是 主 spring 容器
@Configuration
@ComponentScan("com.itheima")
@Import(GetSqlSession.class)
public class SeringConfiguration {

}
