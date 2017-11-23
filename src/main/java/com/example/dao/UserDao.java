/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.example.dao;

import com.example.bean.UserInfo;
import com.example.dao.baseDao.MyMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author wb-lcw229616
 * @version $Id: UserDao.java, v 0.1 2017年11月23日 16:53 wb-lcw229616 Exp $
 */
@Mapper
public interface UserDao extends MyMapper<UserInfo> {
    @Select("SELECT * FROM USERINFO WHERE username = #{username}")
    UserInfo findByName(@Param("username") String username);

    @Insert("INSERT INTO USERINFO(username, password) VALUES(#{username}, #{password})")
    int insertUser(@Param("username") String name, @Param("password") String password);

}