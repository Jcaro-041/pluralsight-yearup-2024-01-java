package com.pluralsight.views;

import com.pluralsight.PizzeriaApplication;
package com.pluralsight.views;
import java.util.ArrayList;
import java.util.Scanner;
public class UserInput {
    Scanner scanner = new Scanner(System.in);
    public void displayHomeScreen(){
        System.out.println();
        System.out.println("Welcome to Caros' Pizzeria");
        System.out.println("-----------------------------------");
        System.out.println();
    }

    public String getCustomerName(){
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine().strip();
        System.out.println();

        return name;
    }
    public void displayBeginOrder(){
        System.out.println("Begin Order");
        System.out.println("----------------");
    }
    public String getPizzaSize(){
        System.out.println("Menu");
        System.out.println("----------");
        System.out.println("Pizza sizes:");
        System.out.println("  (S)mall - $5.99");
        System.out.println("  (M)edium - $8.99");
        System.out.println("  (L)arge - $11.99");
        System.out.print("Select your pizza size: ");
        String size = scanner.nextLine().strip();
        System.out.println();

        return size;
    }
    public String getSauce(){
        System.out.println("Sauces");
        System.out.println("  (T)omato");
        System.out.println("  (A)lfredo");
        System.out.println("  (B)BQ");
        System.out.print("Select your sauce: ");
        String sauce = scanner.nextLine().strip();
        System.out.println();

        return sauce;
    }
    public String getCheese(){
        System.out.println("Cheeses: ");
        System.out.println("  (M)ozzerella");
        System.out.println("  (P)rovolone");
        System.out.println("  (A)merican");
        System.out.println("  (C)heddar");
        System.out.print("Select your cheese: ");
        String cheese = scanner.nextLine().strip();
        System.out.println();

        return cheese;
    }
    public String getToppings(){
        ArrayList<String> toppings = new ArrayList<>();

        System.out.print("Would you like toppings? $1 each Y/N:  ");
        String addToppings = scanner.nextLine().strip();

        while(addToppings.equalsIgnoreCase("y")){
            System.out.println("Enter a topping name:  ");
            String topping = scanner.nextLine();
            toppings.add(topping);

            System.out.print("Add another topping? Y/N  ");
            addToppings = scanner.nextLine().strip();
        }
        return toppings;
    }

    public void displayOrder(String name, double totalPrice, Pizza pizza){

    }
}
