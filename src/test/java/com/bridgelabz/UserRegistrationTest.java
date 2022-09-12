package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

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

    @Test
    public void validateEmailsTest() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("abc@yahoo.com");
        list.add("abc-100@yahoo.com");
        list.add("abc.100@yahoo.com");
        list.add("abc111@abc.com");
        list.add("abc-100@abc.net");
        list.add("abc.100@abc.com.au");
        list.add("abc@gmail.com.com");
        list.add("abc+100@gmail.com");
        for (int i = 0; i < list.size(); i++) {
            boolean result = userRegistration.emailID(list.get(i));
            Assert.assertTrue(result);
        }
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("abc");
        list1.add("abc@.com.my");
        list1.add("abc123@gmail.a8");
        list1.add("abc123@.com");
        list1.add("abc123@.com.com");
        list1.add(".abc@abc.com");
        list1.add("abc()*gmail.com");
        list1.add("abc@%*.com");
        list1.add("abc@gmail.com.1a");
        for (int i = 0; i < list1.size(); i++) {
            boolean result = userRegistration.emailID(list1.get(i));
            Assert.assertFalse(result);
        }
    }
}
