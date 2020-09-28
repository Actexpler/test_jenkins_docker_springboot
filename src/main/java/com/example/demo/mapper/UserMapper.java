package com.example.demo.mapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wangzongcheng
 * @ClassName UserMapper.java
 * @Description TODO
 * @createTime 2020-09-28- 20:59:00
 */
@Mapper
public interface UserMapper {
    List<User> list();
}
