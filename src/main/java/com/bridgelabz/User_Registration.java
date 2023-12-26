package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

// Use Case 4:
// As a User need to follow pre-defined Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10
//digit number
class User{
    String firstName,lastName,email,mobileNumber;
    User(String firstName,String lastName,String email,String mobileNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }
    @Override
    public String toString() {
        return "First Name : "+firstName+
                "\nLast Name : "+lastName+
                "\nEmail : "+email+
                "\nMobile Number : "+mobileNumber;
    }
}
class validateUser{
    public boolean validFirstName(String firstName){
        if(Pattern.matches("^[A-Z][a-z]{2,}",firstName)){
            return true;
        }
        else {
            System.out.println("Invalid First Name");
            return false;
        }
    }
    public boolean validLastName(String lastName){
        if(Pattern.matches("^[A-Z][a-z]{2,}",lastName)){
            return true;
        }
        else {
            System.out.println("Invalid First Name");
            return false;
        }
    }
    public boolean validEmail(String email){
        if(Pattern.matches("^[A-Za-z0-9.]+@(.+)$",email)){
            return true;
        }
        else {
            System.out.println("Invalid First Name");
            return false;
        }
    }
    public boolean validMobile(String mobileNumber){
        if(Pattern.matches("^[9]{1}[1]{1}\s[0-9]{10}",mobileNumber)){
            return true;
        }
        else {
            System.out.println("Invalid First Name");
            return false;
        }
    }
    String firstName,lastName,email,mobileNumber;
    Scanner sc = new Scanner(System.in);
    public void setDetails(){
        System.out.println("Enter First Name : ");
        firstName = sc.next();
        System.out.println("Enter Last Name : ");
        lastName = sc.next();
        System.out.println("Enter Email : ");
        email = sc.next();
        System.out.println("Enter Mobile Number : ");
        mobileNumber = sc.next();
        if(validFirstName(firstName) && validLastName(lastName) && validEmail(email) && validMobile(mobileNumber)){
            User prakash = new User(firstName,lastName,email,mobileNumber);
            System.out.println(prakash);
        }
        else {
            System.out.println("Invalid Details...");
        }
    }
}
public class User_Registration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem");
        validateUser v = new validateUser();
        v.setDetails();
    }
}
