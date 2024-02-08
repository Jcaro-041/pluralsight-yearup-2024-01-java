package com.pluralsight.models;

import java.util.ArrayList;

public class Pizza {
    private String size;
    private String sauce;
    private String cheese;
    private ArrayList<String> toppings;

    public Pizza(){
        size = "Small";
        sauce = "Tomato";
        cheese = "Mozzarella";
        toppings = new ArrayList<>();
    }
}
