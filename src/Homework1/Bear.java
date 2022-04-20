package Homework1;

public class Bear extends Animal {

    public String burn;
    public static int burnedBears = 0;

    public Bear(String name, int leg, int weight, int age, String burn) {
        super(name, leg, weight, age);
        if (burn == "Yes") {
            burnedBears++;
        }


    }

    public Bear() {

    }

    public void setBear(String num) {
        System.out.println("Burned down: " + num + burnedBears);
    }

}