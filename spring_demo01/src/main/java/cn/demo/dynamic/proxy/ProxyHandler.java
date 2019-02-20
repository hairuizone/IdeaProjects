package cn.demo.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author laoganbu
 * @date: 2019/1/18 10:18
 */
public class ProxyHandler implements InvocationHandler {

    private Object proxied;
    public ProxyHandler(Object proxied){
        this.proxied = proxied;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied,args);
    }
}
