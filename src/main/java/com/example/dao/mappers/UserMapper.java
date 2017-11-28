/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.example.dao.mappers;

import java.util.List;

import com.example.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wb-lcw229616
 * @version $Id: UserMapper.java, v 0.1 2017年11月28日 11:45 wb-lcw229616 Exp $
 */
@Mapper
public interface UserMapper {

     List<UserInfo> getAll();
}