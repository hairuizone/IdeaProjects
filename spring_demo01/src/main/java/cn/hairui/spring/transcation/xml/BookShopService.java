package cn.hairui.spring.transcation.xml;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/2/22 23:37
 */
public interface BookShopService {

    /**
     * 购买书籍
     * @param useraccount
     * @param serno
     */
    public void buyBook(String useraccount, String serno);
}
