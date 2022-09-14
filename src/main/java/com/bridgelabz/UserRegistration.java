package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    User user = new User();

    public boolean firstName(String firstName) {
        boolean result = (Pattern.matches("[A-Z]{1,}[a-zA-z]{2,10}", firstName));
        if (result) {
            user.setFirstName(firstName);
            return true;
        } else {
            throw new UserRegistrationException("Invalid first Name Please try Again");
        }
    }

    public boolean lastName(String lastName) {
        boolean result = (Pattern.matches("[A-Z]{1,}[a-zA-z]{2,10}", lastName));
        if (result) {
            user.setLastName(lastName);
            return true;
        } else {
            throw new UserRegistrationException("Invalid last Name Please try Again");
        }
    }

    public boolean emailID(String emailID) {
        boolean result = (Pattern.matches("^[a-zA-Z\\d]{1,1}[a-zA-Z\\d+_.-]+@[a-zA-Z]+.[a-zA-z.]{2,}", emailID));
        if (result) {
            user.setEmail(emailID);
            return true;
        } else {
            throw new UserRegistrationException("Invalid Email Please try Again");
        }
    }

    public boolean phoneNumber(String phoneNumber) {
        boolean result = (Pattern.matches("^[6789]{1}[\\d]{9}", phoneNumber));
        if (result) {
            user.setPhoneNumber(phoneNumber);
            return true;
        } else {
            throw new UserRegistrationException("Invalid Phone Number Please try Again");
        }
    }

    public boolean password(String password) {
        boolean result = Pattern.matches("(?=.*?[A-Z])(?=.*?[!@#$^&*.])(?=.*?[0-9])([a-zA-Z\\d@*#$&,.]){8,}", password);
        if (result) {
            user.setPassword(password);
            return true;
        } else {
            throw new UserRegistrationException("Invalid Password Please try Again");
        }
    }
}
