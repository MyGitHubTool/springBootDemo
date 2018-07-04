package com.ctban.swallow.controller;

import com.ctban.swallow.conf.CommonApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GuoJie 2018/7/4 16:37
 */
@RestController
public class TestController {

    @Value("${user.age}")
    private String age;

    @Value("${user.address}")
    private String address;

    @Autowired
    private CommonApplication commonApplication;

    @RequestMapping("test")
    public void test() {
        System.out.println(age);
        System.out.println(address);
        System.out.println(commonApplication.getAddress());
    }
}
