package cn.hairui.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author laoganbu
 * @date: 2019/2/19 15:40
 */
public class ContextLoaderMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ParentConfig.class);
        Car car = (Car) context.getBean("audi");
        car.print();

        car = (Car) context.getBean("benz");
        car.print();
    }

}
