package Homework1;

public class Snail extends Animal {
    public String bar;
    public static int countBar = 0;

    public Snail(String name, int leg, int weight, int age, String bar, boolean fly) {
        super(name, leg, weight, age, fly);
        if (bar == "Yes")
            countBar++;
    }

    public Snail() {

    }

    public void setSnail(String num) {
        System.out.println("How many were kicked out of the bar?: " + num + countBar);
    }

}