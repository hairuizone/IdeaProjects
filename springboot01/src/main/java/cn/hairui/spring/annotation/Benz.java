package cn.hairui.spring.annotation;

import org.springframework.stereotype.Component;

/**
 * @author laoganbu
 * @date: 2019/2/19 15:35
 */
@Component
public class Benz implements Car {

    @Override
    public void print() {
        System.out.println("我是一台奔驰车！！！");
    }
}
