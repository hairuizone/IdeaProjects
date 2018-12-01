package cn.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        //创建spring的IOC容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        //从IOC容器中获取Bean实例
        User u = (User) ctx.getBean("user");
        //调用toString()方法
        System.out.println(u.toString());

        //通过类型返回IOC容器中的bean  要求IOC容器中必须只能由一个该类型的bean
        //HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

        //通过id定位到IOC容器中的bean
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld2");
        System.out.println(helloWorld.toString());
    }
}
