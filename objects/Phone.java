package objects;

import interfaces.Device;
import interfaces.Mobile;

public class Phone extends Product implements Device, Mobile {
    //Interface Segregation Principle
    //Dependency Inversion Principle
    private final String name = "objects.Phone";
    private final int price = 328;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void enable() {
        System.out.println("The phone is on");
    }

    @Override
    public void carry() {
        System.out.println("Take your phone with you");
    }
}