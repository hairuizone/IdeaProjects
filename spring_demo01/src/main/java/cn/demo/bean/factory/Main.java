package cn.demo.bean.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/1/7 22:48
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("factory.xml");
        Car car = (Car) ctx.getBean("car1");
        System.out.println(car);

        car = (Car) ctx.getBean("car2");
        System.out.println(car);

    }
}
