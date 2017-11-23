/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.example.controller;
import java.util.List;

import com.example.bean.User;
import com.example.bean.UserInfo;
import com.example.service.TestInterFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author wb-lcw229616
 * @version $Id: UserController.java, v 0.1 2017年11月23日 16:18 wb-lcw229616 Exp $
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private TestInterFace testInterFace;

    @RequestMapping("/get")
    @ResponseBody
    UserInfo getUser() {
        return testInterFace.testUser();
    }

    //增加新的对外访问接口
    @RequestMapping("/add")
    @ResponseBody String add() {
        testInterFace.insertUser("username123寇鑫","password123寇鑫");
        return "插入成功";
    }

    //新增的接口方法
    @RequestMapping("/getall")
    @ResponseBody
    List<UserInfo> getall() {
        return testInterFace.selectALL();
    }
}