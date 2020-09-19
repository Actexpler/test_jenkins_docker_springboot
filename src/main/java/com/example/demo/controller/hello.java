package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzongcheng
 * @ClassName hello.java
 * @Description TODO
 * @createTime 2020-09-12- 19:48:00
 */
@RestController
@RequestMapping(value = "/hello")
public class hello {

    @RequestMapping(value = "/say/{name}", method = RequestMethod.GET)
    public String sayHello(@PathVariable("name")String name) {
        return "hello, " + name;
    }
}
