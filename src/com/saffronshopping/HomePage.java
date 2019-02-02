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
            System.out.println("Please enter the following information for Sign up- \n 1- Username");
            customer.setCustomerName(scanner.nextLine());
            System.out.println("2- Password");
            customer.setAddress(scanner.nextLine());
            System.out.println("3- Confirm Password");
            customer.setEmail(scanner.nextLine());
            System.out.println("4- Name");
            customer.setUsername(scanner.nextLine());
            System.out.println("5- Address");
            customer.setUsername(scanner.nextLine());
            System.out.println("6- Email");
            customer.setPassword(scanner.nextLine());
        } else if (userChoice.contains("2")) {

        }
    }
}
