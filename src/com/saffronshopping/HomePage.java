package com.saffronshopping;
import java.util.Scanner;
public class HomePage {

    public static void main(String args[]) {
        CustomerDetails customer = new CustomerDetails();
        System.out.println("Welcome to Amazon online shopping.");
        System.out.println("Welcome to  online Shopping System.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select a choice \n 1- Sign Up \n 2- Sign In");
        String userChoice = scanner.nextLine();
        if (userChoice.contains("1")) {
            customer.register();
        } else if (userChoice.contains("2")) {
            customer.login();
        }
    }
}
