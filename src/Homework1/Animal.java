package Homework1;

public class Animal {
    private String name;
    private int leg;
    private int weight;
    private int age;
    public static int count = 0;


    public Animal(String name, int leg, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.leg = leg;
        this.age = age;
        count++;
        System.out.println(getInfo());
    }

    public Animal() {

    }

    public void setCount(String num) {
        System.out.println("Number of animals: " + num + count);
    }

    public String getInfo() {
        String info = "Name: " + name + ". Age " + age + ". Weight " + weight + ". Leg " + leg;
        return info;

    }

}
