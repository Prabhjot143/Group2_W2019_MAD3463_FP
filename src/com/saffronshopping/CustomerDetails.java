package com.saffronshopping;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerDetails {
    private String customerName;
    private String address;
    private String email;
    private String password;
    private String confirmPassword;
    private String username;
    private String creditCardInfo;
    private String shippingInfo;
    private ArrayList<String> validUsername = new ArrayList<String>();
    private ArrayList<String> validPassword = new ArrayList<String>();

    Scanner scanner = new Scanner(System.in);

    public ArrayList<String> getValidUsername() {
        return validUsername;
    }

    public void setValidUsername(ArrayList<String> validUsername) {
        this.validUsername = validUsername;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCreditCardInfo() {
        return creditCardInfo;
    }

    public void setCreditCardInfo(String creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    public String getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(String shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public void register()
    {
        System.out.println("Please enter the following information for Sign up- \n 1- Username");
        username= scanner.nextLine();
        while (validUsername.contains(username)){
            System.out.println("Username already exist. Please re-enter another username.");
            username= scanner.nextLine();
        }
        validUsername.add(username);
        System.out.println("2- Password");
        password =scanner.nextLine();
        validPassword.add(password);
        System.out.println("3- Confirm Password");
        confirmPassword =scanner.nextLine();
        System.out.println("4- Name");
        customerName =scanner.nextLine();
        System.out.println("5- Address");
        address =scanner.nextLine();
        System.out.println("6- Email");
        email =scanner.nextLine();
        System.out.println("Sign up completed successfully.");
    }

    public void login(){
        System.out.println("Please enter valid Username and Password- \n Username: ");
        username= scanner.nextLine();
        while (!(validUsername.contains(username))){
            System.out.println("invalid username");
            username= scanner.nextLine();
        }
        System.out.println("Password: ");
        password=scanner.nextLine();
        while (!(validPassword.contains(password))){
            System.out.println("invalid password");
            password= scanner.nextLine();
        }
        System.out.println("Sign in successful.");
    }

    public void updateProfile(){

    }
}
