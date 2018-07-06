package com.ctban.swallow.controller;

import com.ctban.swallow.conf.CommonApplication;
import com.ctban.swallow.dto.UserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author GuoJie 2018/7/4 16:37
 */
@Controller
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

    @ApiOperation(value = "查询用户信息", notes = "查询用户个人信息")
    @ApiImplicitParam(name = "userDTO", value = "用户信息参数", required = true, dataType = "UserDTO")
    @RequestMapping("findUserInfo")
    public UserDTO findUserInfo(@RequestBody UserDTO userDTO) {
        System.out.println(age);
        System.out.println(address);
        System.out.println(commonApplication.getAddress());

        UserDTO userDTO1 = new UserDTO();
        userDTO1.setUserName("呵呵呵呵");
        userDTO1.setAge(25);

        return userDTO1;
    }


    @RequestMapping("/")
    public String testHtml() {
        return "index";
    }
}
