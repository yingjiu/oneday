/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.example.controller;

import com.example.bean.User;
import com.example.bean.UserInfo;
import com.example.service.TestInterFace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestBootController {
    @Autowired
    private TestInterFace testInterFace;

    //增加日志
    private final Logger log = LoggerFactory.getLogger(TestBootController.class);

    @RequestMapping("/num")
    @ResponseBody
    int home() {
        log.info("sssss");
        int i = testInterFace.testInterFace();
        return i;
    }

    @RequestMapping("/get")
    @ResponseBody
    UserInfo getUser() {
        log.info("sssss");
        return testInterFace.testUser();
    }
}