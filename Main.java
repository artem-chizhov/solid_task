import objects.*;

import java.util.Scanner;

public class Main {
    //Magic Numbers Principle
    public static final char USDT = (char) 0x24;

    public static void main(String[] args) {
        //Liskov substitution principle
        Product[] products = {new Bread(), new Apple(), new Milk(), new Phone()};
        //DRY
        printProucts(products);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the item number and quantity or enter `end`:");
            String input = scanner.nextLine();
            if ("end".equals(input)) break;
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            products[productNumber].setCount(Integer.parseInt(parts[1]));
        }
        printProucts(products);
        printBasket(products);
    }

    private static void printProucts(Product[] products) {
        System.out.println("List of possible items to buy: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
    }

    private static void printBasket(Product[] products) {
        int costProducts = 0;
        System.out.println("Your shopping cart: ");
        for (Product product : products) {
            if (product.getCount() != 0) {
                costProducts += product.getCount() * product.getPrice();
                System.out.println(product + " 'quantity'= " + product.getCount() + " pieces"
                        + " 'price'= " + product.getPrice() + " " + USDT
                        + " 'cost'= " + product.getCount() * product.getPrice() + " " + USDT);
            }
        }
        System.out.println("total: " + costProducts + " " + USDT);
    }
}