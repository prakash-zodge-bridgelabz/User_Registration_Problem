package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

// Use Case 3:
// As a User need to enter a valid email - E.g. abc.xyz@bl.co.in
// - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
class User{
    String firstName,lastName,email;
    User(String firstName,String lastName,String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    @Override
    public String toString() {
        return "First Name : "+firstName+
                "\nLast Name : "+lastName+
                "\nEmail : "+email;
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
    String firstName,lastName,email;
    Scanner sc = new Scanner(System.in);
    public void setDetails(){
        System.out.println("Enter First Name : ");
        firstName = sc.next();
        System.out.println("Enter Last Name : ");
        lastName = sc.next();
        System.out.println("Enter Email : ");
        email = sc.next();
        if(validFirstName(firstName) && validLastName(lastName) && validEmail(email)){
            User prakash = new User(firstName,lastName,email);
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
