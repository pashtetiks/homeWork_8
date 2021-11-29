package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Olga", 10);
        cats[1] = new Cat("Ilya", 15);
        cats[2] = new Cat("Zlata", 5);
        cats[3] = new Cat("Anya", 12);

        Plate plate = new Plate(15);

        for (Cat cat: cats){
            cat.eat(plate);
            cat.sauietyInfo();
        }

    }
}
