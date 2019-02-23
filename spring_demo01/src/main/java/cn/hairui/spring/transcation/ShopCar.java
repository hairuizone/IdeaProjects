package cn.hairui.spring.transcation;

import java.util.Arrays;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/2/23 20:20
 */
public interface ShopCar {
    //结账
    public void Settle(String useraccount, String[] sernos);
}
