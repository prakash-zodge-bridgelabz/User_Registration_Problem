package com.bridgelabz;

import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

// Use Case 12, test cases:
// Refactor the Code to throw custom exceptions in case of Invalid User Details
// - Rewrite all Test Cases to take in Custom Exception for Invalid First Name, Last Name, Email, Mobile, and Password
@RunWith(JUnitParamsRunner.class)
public class User_Registration_Test {
    validateUser user;
    @Before
    public void init(){
        user = new validateUser();
    }

    @Test
    public void test_invalidFirstName() throws InvalidUserDetailsException {
        try{
            boolean actual = user.isValidFirstName("123");
        }
        catch (InvalidUserDetailsException e){
            String actual = e.getMessage();
            Assert.assertEquals("Invalid First Name",actual);
        }

    }
    @Test
    public void test_invalidLastName() throws InvalidUserDetailsException {
        try{
            boolean actual = user.isValidLastName("@#");
        }
        catch(InvalidUserDetailsException e){
            String actual = e.getMessage();
            Assert.assertEquals("Invalid Last Name",actual);
        }

    }
//    Parameterised Test to validate multiple entry for the Email Address.
    @Test
    @Parameters({
            "1,bl.co.in,false",
            "2,xyz,false",
            "3,123.@xyz,false"
    })
    public void test_invalidMultipleEmails(int testCaseNumber, String email, boolean res) throws InvalidUserDetailsException {
        try {
            boolean actual = user.isValidEmail(email);
        }catch (InvalidUserDetailsException e){
            String actual = e.getMessage();
            Assert.assertEquals("Invalid Email",actual);
        }
    }
    @Test
    public void test_invalidEmail() throws InvalidUserDetailsException {
        try{
            boolean actual = user.isValidEmail("abc.xyz@");
        }catch (InvalidUserDetailsException e){
            String actual = e.getMessage();
            Assert.assertEquals("Invalid Email",actual);
        }

    }
    @Test
    public void test_invalidMobileNumber() throws InvalidUserDetailsException {
        try{
            boolean actual = user.isValidMobileNumber("73210");
        }catch (InvalidUserDetailsException e){
            String actual = e.getMessage();
            Assert.assertEquals("Invalid Mobile Number",actual);
        }
    }
    @Test
    public void test_invalidPassword() throws InvalidUserDetailsException {
        try{
            boolean actual = user.isValidPassword("@rA2ashh");
        }catch (InvalidUserDetailsException e){
            String actual = e.getMessage();
            Assert.assertEquals("Invalid Password",actual);
        }
    }
}
