package objects;

import interfaces.Food;

public class Apple extends Product implements Food {
    //Open Closed Principle
    private final String name = "Apples";
    private final int price = 2;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void eat() {
        System.out.println("The apples are eaten");
    }
}