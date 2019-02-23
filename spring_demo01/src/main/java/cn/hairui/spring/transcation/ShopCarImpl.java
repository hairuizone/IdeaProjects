package cn.hairui.spring.transcation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/2/23 20:22
 */
@Service
public class ShopCarImpl implements ShopCar {

    @Autowired
    private BookShopService bookShopService;

    @Transactional
    @Override
    public void Settle(String useraccount, String[] sernos) {
        for(String serno:sernos) {
            bookShopService.buyBook(useraccount, serno);
        }
    }
}
