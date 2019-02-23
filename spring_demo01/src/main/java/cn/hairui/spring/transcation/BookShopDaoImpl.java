package cn.hairui.spring.transcation;

import cn.hairui.spring.transcation.exception.AccountException;
import cn.hairui.spring.transcation.exception.BookDaoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/2/22 23:25
 */
@Repository(value="bookShopDao")
public class BookShopDaoImpl implements BookShopDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int findBookPriceBySerno(String serno) {
        String sql = "select price from book where serno = ?";
        return jdbcTemplate.queryForObject(sql,Integer.class,serno);

    }

    @Override
    public void updateBookStockBySerno(String serno) {

        String sql = "select stock from book_stock where serno = ?";
        int stock = jdbcTemplate.queryForObject(sql,Integer.class,serno);
        if(stock == 0){
            throw new BookDaoException("库存不足");
        }
        sql = "update book_stock set stock = stock - 1 where serno = ?" ;
        jdbcTemplate.update(sql,serno);


    }

    @Override
    public void updateAccountBalance(String useraccount, int price) {

        String sql = "select balance from account where useraccount = ?";
        int balance = jdbcTemplate.queryForObject(sql,Integer.class,useraccount);
        if(balance < price){
            throw new AccountException("余额不足");
        }
        sql = "update account set balance = balance - ? where useraccount = ?";
        jdbcTemplate.update(sql,price,useraccount);
    }
}
