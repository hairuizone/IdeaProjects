package cn.demo.aop.impl;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author laoganbu
 * @date: 2019/1/21 20:03
 */
//将此类声明为一个切面：需要将该类放入到ioc容器中
@Component
@Aspect
public class LoggingAspect {
    //声明该方法是一个前置通知
    @Before("execution(public int cn.demo.aop.impl.CalculatorImpl.add(int,int))")
    public void beforeMethod() {
        System.out.println("before method ......");
    }

}
