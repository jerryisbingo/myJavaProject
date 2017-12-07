package com.cb.service;

import com.cb.mapper.UserMapper;
import com.cb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description：
 * @Date 2017-12-7 13:59
 * @Author 陈斌
 */
public interface UserService {

    User selectByPrimaryKey(Long id);

}
