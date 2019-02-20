package cn.demo.dynamic.proxy.example;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/1/19 18:38
 */
public class Main {

    public static void main(String[] args){
            CalculatorInterface target = new CalculatorImpl();
            CalculatorInterface proxy = new CalcuatorLoggingProxy(target).getLoggingProxy();

            int result = proxy.add(1,2 );
            result = proxy.dev(4,5);

    }
}
