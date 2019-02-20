package cn.hairui.spring.jdbc;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/2/18 21:50
 */
public class Employee {

    private int id;
    private String name;
    private String email;
    private Integer deptId;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", deptId=" + deptId +
                ", dept=" + dept +
                '}';
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Dept getDept() {
        return dept;
    }

    private Dept dept;
}
