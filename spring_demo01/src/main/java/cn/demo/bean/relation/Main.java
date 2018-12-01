package cn.demo.bean.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author laoganbu
 * @version V1.0
 * @
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("relation.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

        person = (Person) ctx.getBean("person2");
        System.out.println(person);

        person = (Person) ctx.getBean("person3");
        System.out.println(person);

    }
}
