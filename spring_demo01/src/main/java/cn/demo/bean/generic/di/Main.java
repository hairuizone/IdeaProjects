package cn.demo.bean.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/1/17 21:50
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("generic-di.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.add();
    }
}
