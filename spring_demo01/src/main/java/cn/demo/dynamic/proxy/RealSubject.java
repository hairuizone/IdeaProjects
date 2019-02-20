package cn.demo.dynamic.proxy;

/**
 * @author laoganbu
 * @date: 2019/1/18 10:17
 */
public class RealSubject implements Subject {

    @Override
    public void doSomething() {
        System.out.println("call dosomething ...");
    }
}
