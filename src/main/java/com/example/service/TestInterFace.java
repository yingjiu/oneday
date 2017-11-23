/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.example.service;

import java.util.List;

import com.example.bean.User;
import com.example.bean.UserInfo;

/**
 * @author wb-lcw229616
 * @version $Id: TestInterFace.java, v 0.1 2017年11月23日 16:05 wb-lcw229616 Exp $
 */
public interface TestInterFace  {
    public int testInterFace();

    public UserInfo testUser();

    public int insertUser(String username,String password);//新增的接口

    //新增加的方法
    List<UserInfo> selectALL();
}