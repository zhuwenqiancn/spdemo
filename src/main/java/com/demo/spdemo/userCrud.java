package com.demo.spdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userCrud {

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String postUser() {
        System.out.println("你只是POST一下而矣！");
        return "嗯 ，POST是可以的！";
    }
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser() {
        System.out.println("你只是get一下而矣！");
        return "GET 不能给出您要的结果 ！";
    }
    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String whenError() {
        System.out.println("系统产生了下个错误，请查看后台！");
        return "系统产生了个错误，请查看后台！";
    }

}
