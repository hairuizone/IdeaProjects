package cn.demo.aop.impl.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/1/21 21:32
 */
//将此类声明为一个切面 需要将该类放入到IOC容器中 再声明一个切面

public class LogginAspect {

    public void declareJoinPointExpression(){}
    //声明前置通知 在目标方法调用之前执行
    public void beforeMethod() {
        System.out.println("before method ......");
    }

    public void beforeMethod2(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("before method2 ......");
        System.out.println("the method " + methodName + " start with args " + args);
    }
    //后置通知：在目标方法调用之后执行 无论方法是否发生异常都会被调用执行
    //后置通知中还不能访问目标方法执行的结果
    public void afterMethod(){
        System.out.println("this is after method ......");
    }
    //返回通知：在方法调用后返回执行，返回通知可以访问到目标方法的返回值的
    public void AfterReturningMethod(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("this is " + methodName+ "'s return with " + result);
    }
    //异常通知：在方法调用发生异常时候执行
    public void afterThrowingMethod(JoinPoint joinPoint,Exception ex){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("the method " + methodName+ " throw exception with " + ex);
    }


    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Exception {

        Object result = null;
        try {
            //前置通知
            String methodName = proceedingJoinPoint.getSignature().getName();
            Object[] args = proceedingJoinPoint.getArgs();
            System.out.println("the around method begins method " + methodName + " with " + Arrays.asList(args));
            result = proceedingJoinPoint.proceed();
            //返回通知
            System.out.println("the around method return method " + methodName +" with " +result) ;
        }catch (Throwable throwable) {
            System.out.println("the around method occurs exception with " + throwable);
            throw new Exception(throwable);
        }
        //后置通知
        System.out.println("the around method ends with " + result);
        return result;
    }
}
