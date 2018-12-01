package cn.demo.spring;

public class HelloWorld {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter....");
        System.out.println(name);
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "Hello World";
    }
}
