package objects;

import interfaces.Food;

public class Milk extends Product implements Food {
    //Single Responsibility Principle - класс objects.Milk описывает только молоко, а не все продукты
    private final String name = "objects.Milk";
    private final int price = 3;

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
        System.out.println("objects.Milk is drunk");
    }
}