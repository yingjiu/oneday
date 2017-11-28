/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.example.dao.mybatis;

/**
 * @author wb-lcw229616
 * @version $Id: MyBatisConfig.java, v 0.1 2017年11月23日 17:09 wb-lcw229616 Exp $
 */
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * Created by kx on 17/4/2.
 */
@Configuration
@MapperScan("com.example.dao.mybatis.mappers")
public class MyBatisConfig {
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource());

        bean.setTypeAliasesPackage("com.example.bean");

        //分页插件设置
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("returnPageInfo", "check");
        properties.setProperty("params", "count=countSql");
        pageHelper.setProperties(properties);

        //添加分页插件
        bean.setPlugins(new Interceptor[]{pageHelper});

        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            //基于注解扫描Mapper，不需配置xml路径
            bean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
            return bean.getObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource(){
        return new DruidDataSource();
    }
}