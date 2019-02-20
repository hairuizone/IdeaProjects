package cn.demo.aop.impl.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/1/21 21:36
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-aop.xml");
        CalculatorInterface calculator = (CalculatorInterface) ctx.getBean("calculatorImpl");
        System.out.println(calculator.getClass().getName());
        int result = calculator.add(2,4);
        System.out.println(result);
        result = calculator.dev(6,3);
        System.out.println(result);
        //result = calculator.dev(6,0);
        //System.out.println(result);
    }
}
