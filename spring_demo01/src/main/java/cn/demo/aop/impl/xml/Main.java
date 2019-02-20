package cn.demo.aop.impl.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/2/16 20:15
 */
public class Main {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-aop-xml.xml");
        CalculatorInterface calculator = (CalculatorInterface) ctx.getBean("calculatorImpl");
        System.out.println(calculator.getClass().getName());
        int result = calculator.add(2,4);
        System.out.println(result);
        result = calculator.dev(6,3);
        System.out.println(result);
        result = calculator.dev(6,0);
        System.out.println(result);
    }

}
