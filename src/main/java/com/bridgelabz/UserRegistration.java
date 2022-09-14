package com.bridgelabz;

import java.util.regex.Pattern;
interface IUserDatilsValidate{
    boolean validate(String input);
}
public class UserRegistration {
    User user = new User();

    IUserDatilsValidate firstName = firstName -> {
        boolean result = (Pattern.matches("[A-Z]{1,}[a-zA-z]{2,10}", firstName));
        if (result) {
            user.setFirstName(firstName);
            return true;
        } else {
            throw new UserRegistrationException("Invalid first Name Please try Again");
        }
    };

    IUserDatilsValidate lastName= lastName -> {
        boolean result = (Pattern.matches("[A-Z]{1,}[a-zA-z]{2,10}", lastName));
        if (result) {
            user.setLastName(lastName);
            return true;
        } else {
            throw new UserRegistrationException("Invalid last Name Please try Again");
        }
    };

    IUserDatilsValidate emailID = emailID-> {
        boolean result = (Pattern.matches("^[a-zA-Z\\d]{1,1}[a-zA-Z\\d+_.-]+@[a-zA-Z]+.[a-zA-z.]{2,}", emailID));
        if (result) {
            user.setEmail(emailID);
            return true;
        } else {
            throw new UserRegistrationException("Invalid Email Please try Again");
        }
    };

    IUserDatilsValidate phoneNumber = phoneNumber -> {
        boolean result = (Pattern.matches("^[6789]{1}[\\d]{9}", phoneNumber));
        if (result) {
            user.setPhoneNumber(phoneNumber);
            return true;
        } else {
            throw new UserRegistrationException("Invalid Phone Number Please try Again");
        }
    };

    IUserDatilsValidate password = password-> {
        boolean result = Pattern.matches("(?=.*?[A-Z])(?=.*?[!@#$^&*.])(?=.*?[0-9])([a-zA-Z\\d@*#$&,.]){8,}", password);
        if (result) {
            user.setPassword(password);
            return true;
        } else {
            throw new UserRegistrationException("Invalid Password Please try Again");
        }
    };
}
