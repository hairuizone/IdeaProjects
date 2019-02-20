package cn.demo.bean.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/1/7 22:51
 */
public class InstanctBeanFactory {

    Map<String, Car> car = new HashMap<String, Car>();

    public InstanctBeanFactory() {
        car.put("audi", new Car("audi", 36000));
        car.put("benz", new Car("benz", 500000));

    }

    public Car getCar(String brand) {
        return car.get(brand);
    }
}
