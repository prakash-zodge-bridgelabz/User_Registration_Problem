package com.bridgelabz;

import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

// Use Case 11:
// Write JUnit Parameterised Test to validate multiple entry for the Email Address.
@RunWith(JUnitParamsRunner.class)
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
//    Parameterised Test to validate multiple entry for the Email Address.
    @Test
    @Parameters({
            "1,abc.xyz@bl.co.in,true",
            "2,xyz,false",
            "3,123.abc@xyz,false"
    })
    public void test_multipleEmails(int testCaseNumber, String email, boolean res){
        System.out.println("Test Case : "+testCaseNumber+" -->Expected Result : "+res+", Email : "+email+", Actual Result : "+user.validEmail(email));
        Assert.assertEquals(res,user.validEmail(email));
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
