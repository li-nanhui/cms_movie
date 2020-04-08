package com.linh.apps.cms_movie.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration //声明为配置文件
@MapperScan("com.linh.apps.cms_movie.dao")
//@MapperScan("com.linh.apps.cms_movie.dao.extend")
public class MybatisConfig {

}
