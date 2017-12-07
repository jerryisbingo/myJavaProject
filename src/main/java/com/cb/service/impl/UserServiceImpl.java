package com.cb.service.impl;

import com.cb.mapper.UserMapper;
import com.cb.pojo.User;
import com.cb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description：
 * @Date 2017-12-7 15:48
 * @Author 陈斌
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }





}
