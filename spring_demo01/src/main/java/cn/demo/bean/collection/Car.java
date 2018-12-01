package cn.demo.bean.collection;

import java.util.Properties;

public class Car {
    private String brand;
    private String corp;
    private int price;
    private int speed;
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car(String brand, String corp, int price) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    public Car() {
    }

    private Properties color;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                ", color=" + color +
                '}';
    }

    public Properties getColor() {
        return color;
    }

    public void setColor(Properties color) {
        this.color = color;
    }
}
