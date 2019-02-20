package cn.hairui.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/2/18 22:23
 */

/**
 * 这样也能完成dao的基本操作，但是实际使用过程中比较麻烦 不推荐使用
 */
@Repository
public class DeptDao extends JdbcDaoSupport {


    @Autowired
    public void setDataSource2(DataSource dataSource){
        setDataSource(dataSource);
    }
    public Dept query(int id){
        String sql = "select dept_id as deptId,address,name from spring_dept where dept_id =?";
        RowMapper<Dept> rowMapper = new BeanPropertyRowMapper<>(Dept.class);
        Dept dept = this.getJdbcTemplate().queryForObject(sql,rowMapper,id);
        return dept;
    }
}
