package cn.hairui.spring.transcation.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/2/22 23:38
 */
public class BookShopServiceImpl implements BookShopService {


    private BookShopDao bookShopDao;

    public void setBookShopDao(BookShopDao bookShopDao) {
        this.bookShopDao = bookShopDao;
    }

    @Override
    public void buyBook(String useraccount, String serno) {
        int price = bookShopDao.findBookPriceBySerno(serno);
        bookShopDao.updateBookStockBySerno(serno);
        bookShopDao.updateAccountBalance(useraccount,price);
    }
}
