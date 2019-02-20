package cn.demo.aop.impl.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/1/23 23:08
 */
//@Order 指定切面执行的优先级 数字越小  优先级越高
@Order(1)
@Aspect
@Component
public class ValidationAspect {
    //通过切点表达式定义的方式引入
    @Before("cn.demo.aop.impl.annotation.LogginAspect.declareJoinPointExpression()")
    public void validateMethod(JoinPoint joinPoint){
        System.out.println("validate params " + Arrays.asList(joinPoint.getArgs()));
    }
}
