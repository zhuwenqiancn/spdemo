package com.demo.spdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloword() {
        System.out.println("你只是get一下而矣！");
        return "用get来说：helloworld";

    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postHttp() {
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }
        return "postHttp";

    }
}
