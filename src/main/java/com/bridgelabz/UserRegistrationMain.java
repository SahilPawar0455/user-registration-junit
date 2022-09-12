package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        Scanner scanner = new Scanner(System.in);
        UserRegistration userRegistration = new UserRegistration();
        System.out.println("Enter the First Name");
        String firstName = scanner.next();
        userRegistration.firstName(firstName);
        System.out.println("Enter the First Name");
        String lastName = scanner.next();
        userRegistration.lastName(lastName);
        System.out.println("Enter the Email ID");
        String emailID = scanner.next();
        userRegistration.emailID(emailID);
        System.out.println("Enter the Phone Number with Country Code ");
        String phoneNumber = scanner.next();
        userRegistration.phoneNumber(phoneNumber);
        System.out.println("Enter the Password");
        String password = scanner.next();
        userRegistration.password(password);
    }
}
