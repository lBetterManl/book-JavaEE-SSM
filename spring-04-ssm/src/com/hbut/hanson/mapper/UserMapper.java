package com.hbut.hanson.mapper;

import com.hbut.hanson.entity.User;

public interface UserMapper {
	
    int deleteUserById(Integer id);

    int insertUser(User user);

    int insertUserSelective(User user);

    User selectUserById(Integer id);

    int updateUserSelective(User user);

    int updateUser(User user);
}