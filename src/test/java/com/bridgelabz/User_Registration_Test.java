package com.bridgelabz;

import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

// Use Case 13, test cases:
// Refactor the Code to use Lambda Function to validate User Entry
// - Use Lambda Function to validate First Name, Last Name, Email, Mobile, and Password
@RunWith(JUnitParamsRunner.class)
public class User_Registration_Test {
    validateUser user;
    @Before
    public void init(){
        user = new validateUser();
    }

//    @Test
//    public void test_invalidFirstName() throws InvalidUserDetailsException {
//        try{
//            boolean actual = user.isValidFirstName("123");
//        }
//        catch (InvalidUserDetailsException e){
//            String actual = e.getMessage();
//            Assert.assertEquals("Invalid First Name",actual);
//        }
//
//    }
    @Test
    public void test_validFirstName() throws InvalidUserDetailsException {
        try{
            boolean actual = user.isValidFirstName("Prakash");
        }
        catch (InvalidUserDetailsException e){
            String actual = e.getMessage();
            Assert.assertEquals("Valid",actual);
        }

    }
    @Test
    public void test_validLastName() throws InvalidUserDetailsException {
        try{
            boolean actual = user.isValidLastName("Zodge");
        }
        catch(InvalidUserDetailsException e){
            String actual = e.getMessage();
            Assert.assertEquals("Valid",actual);
        }

    }
//    Parameterised Test to validate multiple entry for the Email Address.
    @Test
    @Parameters({
            "1,abc.xyz@bl.co.in,true",
            "2,abc@bl.co,true",
            "3,abc12@bl.co.in,true"
    })
    public void test_validMultipleEmails(int testCaseNumber, String email, boolean res) throws InvalidUserDetailsException {
        try {
            boolean actual = user.isValidEmail(email);
        }catch (InvalidUserDetailsException e){
            String actual = e.getMessage();
            Assert.assertEquals("Valid",actual);
        }
    }
    @Test
    public void test_validEmail() throws InvalidUserDetailsException {
        try{
            boolean actual = user.isValidEmail("abc.xyz@bl.co.in");
        }catch (InvalidUserDetailsException e){
            String actual = e.getMessage();
            Assert.assertEquals("Valid",actual);
        }
    }
    @Test
    public void test_validMobileNumber() throws InvalidUserDetailsException {
        try{
            boolean actual = user.isValidMobileNumber("91 9876543210");
        }catch (InvalidUserDetailsException e){
            String actual = e.getMessage();
            Assert.assertEquals("Valid",actual);
        }
    }
    @Test
    public void test_validPassword() throws InvalidUserDetailsException {
        try{
            boolean actual = user.isValidPassword("@rA2ashh");
        }catch (InvalidUserDetailsException e){
            String actual = e.getMessage();
            Assert.assertEquals("Valid",actual);
        }
    }
}
