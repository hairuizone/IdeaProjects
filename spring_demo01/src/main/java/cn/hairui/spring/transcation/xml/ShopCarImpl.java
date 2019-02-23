package cn.hairui.spring.transcation.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/2/23 20:22
 */
public class ShopCarImpl implements ShopCar {


    private BookShopService bookShopService;

    public void setBookShopService(BookShopService bookShopService) {
        this.bookShopService = bookShopService;
    }

    @Override
    public void Settle(String useraccount, String[] sernos) {
        for(String serno:sernos) {
            bookShopService.buyBook(useraccount, serno);
        }
    }
}
