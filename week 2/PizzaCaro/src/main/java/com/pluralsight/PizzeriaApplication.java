package com.pluralsight;

import com.pluralsight.views.UserInput;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

// pizza app acts as the controller
// it is responsible for the logical flow of the app
public class PizzeriaApplication {
    UserInput ui = new UserInput();

    private final double TOPPING_PRICE = 1.5;
    public void run(){
        Scanner scanner = new Scanner(System.in);

        ui.displayHomeScreen();
        String name = ui.getCustomerName();
        ui.displayBeginOrder();
        String size = ui.getPizzaSize();
        String sauce = ui.getSauce();
        String cheese = ui.getCheese();
        ArrayList<String> toppings = ui.getToppings();

        Pizza pizza = new Pizza();
        pizza.setSize(size);
        pizza.setSauce(sauce);
        pizza.setCheese(cheese);
        pizza.setToppings(toppings);
        // toppings
        // price
        double basePrice = 5.99;
        String sizeDisplay ="Small";
        if(size.equalsIgnoreCase("m")){
            basePrice = 8.99;
            sizeDisplay = "Medium";
        }
        else if(size.equalsIgnoreCase("l")){
            basePrice = 11.99;
            sizeDisplay = "Large";
        }
        double totalPrice = basePrice + (toppings.size() * TOPPING_PRICE);

        String sauceDisplay = "Tomato";

        if(sauce.equalsIgnoreCase("a")) sauceDisplay = "Alfredo";
        else if (sauce.equalsIgnoreCase("b")) sauceDisplay = "BBQ";

        String cheeseDisplay = "Mozzarella";

        if (cheese.equalsIgnoreCase("p")) cheeseDisplay = "Provolone";
        else if (cheese.equalsIgnoreCase("a")) cheeseDisplay = "American";
        else if (cheese.equalsIgnoreCase("c")) cheeseDisplay = "Cheddar";

        // order
        System.out.println();
        System.out.println("Order Details: ");
        System.out.println("----------------------");
        System.out.println("Name:  " + name);
        System.out.println("Price:  " + totalPrice);
        System.out.println("Size:  " + sizeDisplay);
        System.out.println("Sauce:  " + sauce);
        System.out.println("Cheese:  " + cheese);
        System.out.println("Toppings:  " + toppings);
    }
}
