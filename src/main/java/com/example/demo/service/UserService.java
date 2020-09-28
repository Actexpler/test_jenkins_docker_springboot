package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangzongcheng
 * @ClassName userService.java
 * @Description TODO
 * @createTime 2020-09-28- 20:58:00
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> list() {
        return userMapper.list();
    }
}
