package com.demo.spdemo.controller;

import com.demo.spdemo.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;

@RestController
@ComponentScan({"com.demo.spdemo.controller"})
@MapperScan("com.demo.spdemo.dao")
public class TestController {

    @Autowired
    private UserInfoService userInfoService;


    /**
     * 测试用
     *
     * @param name     传入参数name
     * @param telphone 传入参数telphone
     * @return 插入结果，失败or成功+id
     */
    @RequestMapping(value = "/user/insert", method = RequestMethod.POST)
    public String insertUser(@RequestParam("name") String name, @RequestParam("telephone") String telephone, @RequestParam("sex") String sex) {

        UserInfo user = new UserInfo();
        //Integer id = UUID.randomUUID().toString().compareToIgnoreCase();
        //user.setId(id);
        //user.setId(3);

        user.setUserName(name);
        user.setUserTelephone(telephone);
        user.setUserSex(sex);
        user.setCreateTime(new Date());
        try {

            //IdWorker idWorker = new IdWorker();
            //final IdWorker idWorker1 = new IdWorker(0, 0);
            //long id = idWorker1.nextId();
            //user.setId((int) id);
            //System.out.println("id:"+id);

            int i = userInfoService.insert(user);
            System.out.println(i);
            /*
            System.out.println(user.getTelephone());
            System.out.println(user.getSex());
            */
            return "插入成功，其id为自增函数";//+ id;
        } catch (Exception e) {
            System.out.println(e.toString());
            return "插入失败！";
        }

    }

}
