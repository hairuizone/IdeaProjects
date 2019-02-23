package cn.hairui.spring.transcation.xml;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/2/22 23:40
 */
public class BookShopTest {

    private ApplicationContext ctx = null;
    private BookShopDao bookShopDao = null;
    private BookShopService bookShopService = null;
    private ShopCar shopCar;
    {
        ctx = new ClassPathXmlApplicationContext("jdbc/appliacationContext-xml.xml");
        bookShopDao = (BookShopDao) ctx.getBean("bookShopDao");
        bookShopService = ctx.getBean(BookShopService.class);
        shopCar = ctx.getBean(ShopCar.class);
    }

    @Test
    public void testfindBookPriceBySerno(){
        int price = bookShopDao.findBookPriceBySerno("1001");
        System.out.println(price);

    }

    @Test
    public void testUpdateBookStock(){
        bookShopDao.updateBookStockBySerno("1001");
    }

    @Test
    public void testUpdateAccountBalance(){
        bookShopDao.updateAccountBalance("zhangsan666",10);
    }

    @Test
    public void testBuyBook(){
        bookShopService.buyBook("zhangsan666","1001");
    }

    @Test
    public void testSettleBooks(){
        shopCar.Settle("zhangsan666",new String[]{"1001","1002"});
    }
}
