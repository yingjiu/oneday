/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.example.bean;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author wb-lcw229616
 * @version $Id: UserInfo.java, v 0.1 2017年11月23日 16:55 wb-lcw229616 Exp $
 */
//增加注解声明表名
@Table(name = "userinfo")
public class UserInfo {
    //增加注解声明字段名
    @Column(name = "username")
    private String username = "username寇鑫123";
    @Column(name = "password")
    private String password = "password寇鑫123";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "username='" + username + '\'' + ", password='" + password + '\'' + '}';
    }
}