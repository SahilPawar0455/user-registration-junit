package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void validateFirstNameTestForPositive() {
        boolean actual1 = userRegistration.firstName("Sahil");
        Assert.assertTrue(actual1);
    }

    @Test
    public void validateFirstNameTestForNegative() {
        boolean actual2 = userRegistration.firstName("sahil");
        Assert.assertTrue(actual2);
    }

    @Test
    public void validateLastNameTestForPositive() {
        boolean actual1 = userRegistration.lastName("Sharma");
        Assert.assertTrue(actual1);
    }

    @Test
    public void validateLastNameTestForNegative() {
        boolean actual2 = userRegistration.lastName("Sharma.");
        Assert.assertFalse(actual2);
    }

    @Test
    public void validateEmailTestPositive() {
        boolean actual1 = userRegistration.emailID("abc-100@yahoo.com");
        Assert.assertTrue(actual1);
    }

    @Test
    public void validateEmailTestNegative() {
        boolean actual2 = userRegistration.emailID(".rohit@gmail.com");
        Assert.assertFalse(actual2);
    }

    @Test
    public void validateMobilePositive() {
        boolean actual1 = userRegistration.phoneNumber("7350310455");
        Assert.assertTrue(actual1);
    }

    @Test
    public void validateMobileNegative() {
        boolean actual2 = userRegistration.phoneNumber("2395824158");
        Assert.assertFalse(actual2);
    }

    @Test
    public void validatePassword() {
        boolean actual2 = userRegistration.password("sahil12");
        Assert.assertTrue(actual2);
    }

    @Test
    public void validatePasswordNegative() {
        boolean actual1 = userRegistration.password("Sahil@1233");
        Assert.assertFalse(actual1);
    }
}
