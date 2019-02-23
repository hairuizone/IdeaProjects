package cn.hairui.spring.transcation.xml;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/2/22 23:21
 */
public interface BookShopDao {

    //通过序列号查询书的单价
    public int findBookPriceBySerno(String serno);

    //更新书的库存:stock = stock-1(每次只买一本)
    public void updateBookStockBySerno(String serno);

    //更新用户账户:balance = balance - price;
    public void updateAccountBalance(String useraccount, int price);
}
