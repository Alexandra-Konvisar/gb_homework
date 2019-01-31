package lesson7;

import java.util.Random;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name) {
        this.name = name;
        Random a = new Random();
        this.appetite = a.nextInt(10);
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        p.decreaseFood(this,appetite);
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
}