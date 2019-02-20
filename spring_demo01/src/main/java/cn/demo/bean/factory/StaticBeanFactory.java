package cn.demo.bean.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/1/7 22:39
 */
public class StaticBeanFactory {

    private static  Map<String,Car> car = new HashMap<>();
    static {
        car.put("audi",new Car("audi",25000));
        car.put("ford",new Car("ford",150000));
    }


    public static  Car getCar(String brand){
        return car.get(brand);
    }
}
