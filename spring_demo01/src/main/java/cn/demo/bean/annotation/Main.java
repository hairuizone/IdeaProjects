package cn.demo.bean.annotation;

import cn.demo.bean.annotation.controller.UserController;
import cn.demo.bean.annotation.repository.UserRepositoryImpl;
import cn.demo.bean.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/1/14 22:08
 */
public class Main {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("annotation.xml");
        TestObject to  = (TestObject) ctx.getBean("testObject");
        System.out.println(to);

        UserController uc = (UserController) ctx.getBean("userController");
        System.out.println(uc);
        uc.execute();

        UserService us = (UserService) ctx.getBean("userService");
        System.out.println(us);


        /*UserRepositoryImpl uri = (UserRepositoryImpl) ctx.getBean("userRepository");
        System.out.println(uri);*/
    }
}
