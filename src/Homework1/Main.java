package Homework1;

public class Main {
    public static void main(String[] args) {
        Horses oleg = new Horses("Oleg", 5, 100, 11, "Yes");
        Horses ilya = new Horses("Ilya", 3, 45, 15, "Yes");
        Bear egor = new Bear("Egor", 4, 90, 34, "Yes");
        Bear kira = new Bear("Kira", 4, 110, 16, "Yes");
        Wolf alex = new Wolf("Alex", 4, 35, 16, "Yes");
        Wolf alena = new Wolf("Alenka", 2, 60, 14, "No");
        Snail roman = new Snail("Times New Roman", 0, 1, 66, "No");
        Snail alina = new Snail("Alinka", 5, 900, 13, "Yes");
        Cock kiril = new Cock("Kiril", 1, 80, 17, "No");
        Cock anna = new Cock("Anna", 3, 54, 21, "No");

        Animal animal = new Animal();
        animal.setCount("");
        Bear bear = new Bear();
        bear.setBear("");
        Wolf wolf = new Wolf();
        wolf.setWolf("");
        Snail snail = new Snail();
        snail.setSnail("");
        Cock cock = new Cock();
        cock.setCock("");
    }
}
