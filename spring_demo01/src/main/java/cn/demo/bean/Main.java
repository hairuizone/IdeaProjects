package cn.demo.bean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("car.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        Car car2 = (Car) ctx.getBean("car2");
        System.out.println(car2);

        Car car3 = (Car) ctx.getBean("car3");
        System.out.println(car3);

        ctx = new ClassPathXmlApplicationContext("person.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
        person = (Person) ctx.getBean("person2");
        System.out.println(person);
        person = (Person) ctx.getBean("person3");
        System.out.println(person);
        person = (Person) ctx.getBean("person4");
        System.out.println(person);
    }
}
