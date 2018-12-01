package cn.demo.bean.collection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.crypto.Data;

/**
 * @author laoganbu
 * @date: 2018/11/27 20:33
 */
public class Main {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("collection.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

        person  = (Person) ctx.getBean("person2");
        System.out.println(person);

        person  = (Person) ctx.getBean("person3");
        System.out.println(person);

        person  = (Person) ctx.getBean("person4");
        System.out.println(person);

        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);
        System.out.println(dataSource.getProperties().get("user"));
        System.out.println(dataSource.getProperties().get("password"));
        System.out.println(dataSource.getProperties().get("driverClass"));
        System.out.println(dataSource.getProperties().get("jdbcUrl"));
    }

}
