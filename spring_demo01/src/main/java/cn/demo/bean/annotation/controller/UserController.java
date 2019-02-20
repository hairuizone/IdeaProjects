package cn.demo.bean.annotation.controller;

import cn.demo.bean.annotation.TestObject2;
import cn.demo.bean.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/1/14 22:04
 */
@Controller
public class UserController {
    @Autowired(required = false)//装配时不需要实例化bean
    private TestObject2 testObject2;
    @Autowired
    private UserService userService;

    public void execute() {
        System.out.println("UserController execute ......");
        userService.add();
        System.out.println(testObject2);
    }
}
