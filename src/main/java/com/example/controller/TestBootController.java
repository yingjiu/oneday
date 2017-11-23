/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wb-lcw229616
 * @version $Id: TestBootController.java, v 0.1 2017��11��23�� 14:44 wb-lcw229616 Exp $
 */
@Controller
@EnableAutoConfiguration
public class TestBootController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "hello world";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TestBootController.class, args);
    }
}