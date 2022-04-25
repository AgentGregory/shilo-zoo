package Homework1;

public class Wolf extends Animal {
    public String circus;
    public static int countCircus = 0;

    public Wolf(String name, int leg, int weight, int age, String circus, boolean fly) {
        super(name, leg, weight, age, fly);
        if (circus == "Yes")
            countCircus = 0;
    }

    public Wolf() {

    }

    public void setWolf(String num) {
        System.out.println("How many acts in the circus: " + countCircus + ". (the wolf does not perform in the circus) " + num);
    }

}
