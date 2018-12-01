package cn.demo.bean.relation;

/**
 * @author laoganbu
 * @date: 2018/12/1 23:22
 */
public class Person {
    private String  name;
    private String country;
    private String provence;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", provence='" + provence + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvence() {
        return provence;
    }

    public void setProvence(String provence) {
        this.provence = provence;
    }
}
