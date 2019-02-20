package cn.demo.dynamic.proxy.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/1/19 18:31
 */
public class CalcuatorLoggingProxy {

    private CalculatorImpl target;

    public CalcuatorLoggingProxy(CalculatorInterface target) {
        this.target = (CalculatorImpl) target;
    }

    public CalculatorInterface getLoggingProxy() {
        CalculatorInterface proxy = null;
        ClassLoader loder = target.getClass().getClassLoader();
        Class[] interfaces = new Class[]{CalculatorInterface.class};
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            /**
             * proxy 正在被代理的对象
             * method 正在被代理的方法
             * args 调用方法时传入的参数
             */
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("invoke");
                String methodName = method.getName();
                String logging = "the method " + methodName + " begins whith " + Arrays.asList(args);
                System.out.println(logging);
                Object result = method.invoke(target,args);
                logging = "the method finished whit " +result;
                System.out.println(logging);
                return 0;
            }
        };
        proxy = (CalculatorInterface) Proxy.newProxyInstance(loder, interfaces, invocationHandler);
        return proxy;

    }
}
