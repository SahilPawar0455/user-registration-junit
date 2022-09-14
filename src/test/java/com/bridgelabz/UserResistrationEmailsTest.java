package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class UserResistrationEmailsTest {
    private String emails;
    private boolean result;
    UserRegistration userRegistration;

    public UserResistrationEmailsTest(String emails, boolean result) {
        super();
        this.emails = emails;
        this.result = result;
    }

    @Before
    public void initialize(){
        userRegistration = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{{"abc@yahoo.com", true},{"abc-100@yahoo.com",true},{"abc.100@yahoo.com",true},{"abc111@abc.com",true},{"abc-100@abc.net",true},{"abc.100@abc.com.au",true},{"abc@gmail.com.com",true},{"abc+100@gmail.com",true},
                {"abc",false},{"abc@.com.my",false},{"abc123@gmail.a8",false},{"abc123@.com",false},{"abc123@.com.com",false},{".abc@abc.com",false},{"abc()*gmail.com",false},{"abc@%*.com",false},{"abc@gmail.com.1a",false}});
    }
    @Test
    public void testEmails(){
        Assert.assertEquals(result,userRegistration.emailID.validate(emails));
    }
}
