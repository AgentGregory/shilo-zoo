package Homework1;

public class Horses extends Animal {

    public String hooves;
    public static int countHooves = 0;

    public Horses(String name, int leg, int weight, int age, String hooves, boolean fly) {
        super(name, leg, weight, age, fly);
        if (hooves == "Yes")
            countHooves++;
    }

    public Horses() {

    }

    public void setHorses(String num) {
        System.out.println("How many artiodactyls: " + num + countHooves);
    }
}