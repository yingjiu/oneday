/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wb-lcw229616
 * @version $Id: Application.java, v 0.1 2017年11月23日 16:19 wb-lcw229616 Exp $
 */
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.example"})
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}