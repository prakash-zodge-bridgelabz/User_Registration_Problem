package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Use Case 10:
// Write JUnit Test to validate the User Entry for First Name, Last Name,
// Email, Mobile, and Password.
// - Write Junit Test for Happy as well as Sad test case.
// - Happy Test Case validates the Entry Successfully
// - Sad Test Cases fails the Entry
public class User_Registration_Test {
    validateUser user;
    @Before
    public void init(){
        user = new validateUser();
    }

    @Test
    public void test_validFirstName(){
        boolean actual = user.validFirstName("Prakash");
        Assert.assertEquals(true,actual);
    }
    @Test
    public void test_invalidFirstName(){
        boolean actual = user.validFirstName("sad");
        Assert.assertEquals(false,actual);
    }
    @Test
    public void test_validLastName(){
        boolean actual = user.validLastName("Zodge");
        Assert.assertEquals(true,actual);
    }
    @Test
    public void test_validEmail(){
        boolean actual = user.validEmail("abc.xyz@bl.co.in");
        Assert.assertEquals(true, actual);
    }
    @Test
    public void test_validMobileNumber(){
        boolean actual = user.validMobileNumber("91 9876543210");
        Assert.assertEquals(true, actual);
    }
    @Test
    public void test_validPassword(){
        boolean actual = user.validPassword("@rA2ashh");
        Assert.assertEquals(true, actual);
    }
}
