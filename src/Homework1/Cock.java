package Homework1;

public class Cock extends Animal {
    public String gay;
    public static int countGay;

    public Cock(String name, int leg, int weight, int age, String gay, boolean fly) {
        super(name, leg, weight, age, fly);
        if (gay == gay)
            countGay++;
    }

    public Cock() {

    }

    public void setCock(String num) {
        System.out.println("How many gays: " + num + countGay);
    }
}