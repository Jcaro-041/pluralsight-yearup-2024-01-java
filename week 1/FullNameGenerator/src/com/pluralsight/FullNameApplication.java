package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[]args)
    {
        Scanner userInput = new Scanner(System.in);
        String firstName;
        String middleName;
        String lastName;
        String fullName;

        System.out.println("Enter your first name: ");
        firstName = userInput.nextLine();

        System.out.println("Enter your middle name: ");
        middleName = userInput.nextLine();

        System.out.println("Enter your last name: ");
        lastName = userInput.nextLine();

        if (middleName.isEmpty()){
            fullName = firstName + " " + lastName;
            System.out.println("Your full name is: " + fullName);
        }else {
            fullName = firstName + " " + middleName + " " + lastName;
            System.out.println("Your full name is: " + fullName);
        }
    }
}
