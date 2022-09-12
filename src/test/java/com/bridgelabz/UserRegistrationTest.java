package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void validateFirstNameTest() {
        boolean actual1 = userRegistration.firstName("Sahil");
        boolean actual2 = userRegistration.firstName("sahil");
        Assert.assertTrue(actual1);
        Assert.assertFalse(actual2);
    }

    @Test
    public void validateLastNameTest() {
        boolean actual1 = userRegistration.lastName("Sharma");
        boolean actual2 = userRegistration.lastName("Sharma.");
        Assert.assertTrue(actual1);
        Assert.assertFalse(actual2);
    }

    @Test
    public void validateEmailTest() {
        boolean actual1 = userRegistration.emailID("abc-100@yahoo.com");
        boolean actual2 = userRegistration.emailID(".rohit@gmail.com");
        Assert.assertTrue(actual1);
        Assert.assertFalse(actual2);
    }

    @Test
    public void validateMobile() {
        boolean actual1 = userRegistration.phoneNumber("7350310455");
        boolean actual2 = userRegistration.phoneNumber("2395824158");
        Assert.assertTrue(actual1);
        Assert.assertFalse(actual2);
    }

    @Test
    public void validatePassword() {
        boolean actual1 = userRegistration.password("Sahil@1233");
        boolean actual2 = userRegistration.password("sahil12");
        Assert.assertFalse(actual2);
        Assert.assertTrue(actual1);
    }
}
