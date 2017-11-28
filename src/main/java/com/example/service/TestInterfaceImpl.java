/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.example.service;

import java.util.List;

import com.example.bean.UserInfo;
import com.example.dao.UserDao;
import com.example.dao.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wb-lcw229616
 * @version $Id: TestInterfaceImpl.java, v 0.1 2017年11月23日 16:06 wb-lcw229616 Exp $
 */
//业务层接口实现
@Service
public class TestInterfaceImpl implements TestInterFace {
    //引入dao层接口
    @Autowired
    UserDao    userDao;
    @Autowired
    UserMapper userMapper;

    @Override public int testInterFace() {
        return 0;
    }

    @Override public UserInfo testUser() {
        return new UserInfo();
    }

    //新增的接口实现
    @Override public int insertUser(String username,String password) {
        return userDao.insertUser(username,password);
    }


    //新增加的实现
    @Override
    public List<UserInfo> selectALL(){
        //return userDao.selectAll();
        return userMapper.getAll();
    }
}