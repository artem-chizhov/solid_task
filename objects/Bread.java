package objects;

import interfaces.Food;

public class Bread extends Product implements Food {
    private final String name = "objects.Bread";
    private final int price = 1;

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
        System.out.println("The bread is eaten");
    }
}