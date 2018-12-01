package cn.demo.bean.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    /*
    如果要同时使用ioc的属性构造和构造器构造  必须重写无参构造方法
     */
    public Person() {
    }

    public Person(String name, int age, List<Car> cars) {
        this.name = name;
        this.age = age;
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;
    /**
     * List 集合属性
     */
    private List<Car> cars;


    private Map<Object,Object> duty;

    public Map<Object, Object> getDuty() {
        return duty;
    }

    public void setDuty(Map<Object, Object> duty) {
        this.duty = duty;
    }

    private Set<Object> country;

    public Set<Object> getCountry() {
        return country;
    }

    public void setCountry(Set<Object> country) {
        this.country = country;
    }
    private String[] nickname;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                ", duty=" + duty +
                ", country=" + country +
                ", nickname=" + Arrays.toString(nickname) +
                '}';
    }

    public String[] getNickname() {
        return nickname;
    }

    public void setNickname(String[] nickname) {
        this.nickname = nickname;
    }
}
