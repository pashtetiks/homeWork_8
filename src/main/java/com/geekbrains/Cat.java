package com.geekbrains;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        if (p.getFood() < appetite) {
            System.out.println(name +" cant eat, not enough food in the plate");
        } else {
            p.decreaseFood(appetite);
            satiety = true;
        }
    }

    public void sauietyInfo(){
        if (satiety){
            System.out.println(name + " well-fed cat");
        } else {
            System.out.println(name + " not a well-def cat");
        }
    }
}
