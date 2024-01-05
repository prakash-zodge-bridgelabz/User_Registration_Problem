package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

// Use Case 12:
// Refactor the Code to throw custom exceptions in case of Invalid User Details
// - Rewrite all Test Cases to take in Custom Exception for Invalid First Name, Last Name, Email, Mobile, and Password
class User{
    String firstName,lastName,email,mobileNumber,password;
    User(String firstName,String lastName,String email,String mobileNumber,String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.password = password;
    }
    @Override
    public String toString() {
        return "First Name : "+firstName+
                "\nLast Name : "+lastName+
                "\nEmail : "+email+
                "\nMobile Number : "+mobileNumber+
                "\nPassword : "+password;
    }
}
class InvalidUserDetailsException extends Exception{
    InvalidUserDetailsException(String errorMessage){
        super(errorMessage);
    }
}
class validateUser{
    public boolean isValidFirstName(String firstName) throws InvalidUserDetailsException {
        if(Pattern.matches("^[A-Z][a-z]{2,}",firstName)){
            return true;
        }
        else {
            throw new InvalidUserDetailsException("Invalid First Name");
        }
    }
    public boolean isValidLastName(String lastName) throws InvalidUserDetailsException {
        if(Pattern.matches("^[A-Z][a-z]{2,}",lastName)){
            return true;
        }
        else {
            throw new InvalidUserDetailsException("Invalid Last Name");
        }
    }
    public boolean isValidEmail(String email) throws InvalidUserDetailsException{
        if(Pattern.matches("^(?!^[0-9])[A-Za-z0-9.]+@[a-z.]+$",email)){
            return true;
        }
        else {
            throw new InvalidUserDetailsException("Invalid Email");
        }
    }
    public boolean isValidMobileNumber(String mobileNumber) throws InvalidUserDetailsException{
        if(Pattern.matches("^[9]{1}[1]{1}\\s[0-9]{10}$",mobileNumber)){
            return true;
        }
        else {
            throw new InvalidUserDetailsException("Invalid Mobile Number");
        }
    }
    //Atleast 1 upper case & Minimum 8 characters
    // at least 1 numeric number in the password
    // exactly 1 special character
    public boolean isValidPassword(String password)throws InvalidUserDetailsException{
        if(Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[!@#$%^&*][^!@#$%^&*]*$)[a-zA-Z0-9!@#$%^&*]{8,}$",
                password)){
            return true;
        }
        else {
            throw new InvalidUserDetailsException("Invalid Password");
        }
    }
    String firstName,lastName,email,mobileNumber,password;
    Scanner sc = new Scanner(System.in);
    public void setDetails() throws InvalidUserDetailsException {
        System.out.println("Enter First Name : ");
        firstName = sc.nextLine();
        System.out.println("Enter Last Name : ");
        lastName = sc.nextLine();
        System.out.println("Enter Email : ");
        email = sc.nextLine();
        System.out.println("Enter Mobile Number : ");
        mobileNumber = sc.nextLine();
        System.out.println("Enter Password : ");
        password = sc.next();
        if(isValidFirstName(firstName) && isValidLastName(lastName) && isValidEmail(email) &&
                isValidMobileNumber(mobileNumber) && isValidPassword(password)){
            User prakash = new User(firstName,lastName,email,mobileNumber,password);
            System.out.println(prakash);
        }
        else {
            System.out.println("Invalid Details...");
        }
    }
}
public class User_Registration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem...");
    }
}