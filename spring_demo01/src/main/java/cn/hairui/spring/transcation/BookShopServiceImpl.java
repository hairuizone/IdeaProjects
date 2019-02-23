package cn.hairui.spring.transcation;

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
@Service("bookShopService")
public class BookShopServiceImpl implements BookShopService {


    @Autowired
    private BookShopDao bookShopDao;

    //添加事务注解
    //使用propagation指定当前事务被另一个事务方法调用时候的传播行为（默认REQUIRED）
    //REQUIRED_NEW:使用自己的事务，调用的事务方法被挂起
    //isolation 表示事务的隔离级别
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
    @Override
    public void buyBook(String useraccount, String serno) {
        int price = bookShopDao.findBookPriceBySerno(serno);
        bookShopDao.updateBookStockBySerno(serno);
        bookShopDao.updateAccountBalance(useraccount,price);
    }
}
