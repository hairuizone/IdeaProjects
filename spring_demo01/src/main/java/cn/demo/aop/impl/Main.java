package cn.demo.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author laoganbu
 * @date: 2019/1/21 19:57
 */
public class Main {

    public static void main(String[] args){
        //创建spring的IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-aop.xml");
        CalculatorImpl calculator = ctx.getBean(CalculatorImpl.class);
        int result = calculator.add(1,2);
        System.out.println("result = " + result);
    }
}
