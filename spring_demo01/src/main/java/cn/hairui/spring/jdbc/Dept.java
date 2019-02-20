package cn.hairui.spring.jdbc;

/**
 * @author lihairui
 * @version V1.0
 * @date: 2019/2/18 21:51
 */
public class Dept {

    private Integer deptId;
    private String address;
    private String name;

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
