package cn.hairui.spring.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/2/17 10:19
 */
public class JDBCTest {

    private ApplicationContext ctx = null;
    private JdbcTemplate jdbcTemplate;
    private EmployeeDao employeeDao;
    private DeptDao deptDao;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    {
        ctx = new ClassPathXmlApplicationContext("jdbc/appliacationContext.xml");
        jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        employeeDao = ctx.getBean(EmployeeDao.class);
        deptDao = ctx.getBean(DeptDao.class);
        namedParameterJdbcTemplate = ctx.getBean(NamedParameterJdbcTemplate.class);
    }

    @Test
    public void testJdbcTemplate() {
        System.out.println(jdbcTemplate);
    }

    @Test
    public void testCommonDataSourceC3P0() {
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource);
    }

    /**
     * 单条记录的新增
     */
    @Test
    public void testSingleInsert() {
        String sql = "insert into spring_employee(id,name,email,dept_id) values (?,?,?,?)";
        jdbcTemplate.update(sql, 1, "Zhangsan", "test@163.com", 1);
        System.out.println("JdbcTemplate Single Insert ......");

    }

    /**
     * 批量新增记录
     */
    @Test
    public void testBatchInsert() {
        String sql = "insert into spring_employee(id,name,email,dept_id) values (?,?,?,?)";
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{2, "AAAA", "AAAA@163.com", 1});
        list.add(new Object[]{3, "BBBB", "BBBB@163.com", 2});
        list.add(new Object[]{4, "CCCC", "CCCC@163.com", 2});
        jdbcTemplate.batchUpdate(sql, list);
        System.out.println("JdbcTemplate Batch Insert ......");
    }

    @Test
    public void testSingleUpdate() {
        String sql = "update spring_employee set name='Mr ZhangSan' where id=1";
        jdbcTemplate.update(sql);
        System.out.println("JdbcTemplate Single Update ......");
    }


    /**
     * 从数据库中读取一条记录 得到实际与之对应的一个对象
     * sql需要通过别名与属性进行映射
     * RowMapper表示查询到的结果如何映射为实际的对象类型
     * JdbcTemplate不支持ORM框架，不能级联查询属性 所以这里的dept.id为null
     */
    @Test
    public void testQueryForObject() {

        String sql = "select id,name,email,dept_id as \"dept.deptId\" from spring_employee where id=? ";
        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
        Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, 1);
        System.out.println(employee);

        //统计查询
        int count = jdbcTemplate.queryForObject("select count(1) from spring_employee ", Integer.class);
        System.out.println(count);
    }

    /**
     * 测试dao
     */
    @Test
    public void testEmployeeDao() {
        System.out.println(employeeDao.query(1));
    }

    /**
     * dao的另一种方式使用 （不推荐使用）
     * 常用的为JdbcTemplate  JdbcDaoSupport只是作为了解即可
     */
    @Test
    public void testDeptDao() {
        System.out.println(deptDao.query(1));
    }

    /**
     * NamedParameterJdbcTemplate可以为参数取名 以便于区分和维护
     * 缺点是比较麻烦
     *
     */
    @Test
    public void testNamedParameterJdbcTemplate(){
        String sql = "insert into spring_employee(id,name,email,dept_id) values(:id,:name,:email,:deptId)";
        Map<String,Object> map = new HashMap<>();
        map.put("email", "xiaoming@souhu.com");
        map.put("deptId", 1);
        map.put("name", "xiaoming");
        map.put("id", 10);
        namedParameterJdbcTemplate.update(sql,map);

        //还可以通过SqlParameterSource的BeanPropertySqlParameterSource实现类将参数转换
        //传入的对象转化
        Employee employee = new Employee();
        employee.setId(20);
        employee.setName("Jenny");
        employee.setEmail("jenny@sina.com");
        employee.setDeptId(1);
        SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(employee);
        namedParameterJdbcTemplate.update(sql, parameterSource);

    }

}
