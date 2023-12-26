package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

// Use Case 2 :
// As a User need to enter a valid Last Name
// - Last name starts with Cap and has minimum 3 characters
class User{
    String firstName,lastName;
    User(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "First Name : "+firstName+
                "Last Name : "+lastName;
    }
}
class validateUser{
    String firstName,lastName;
    Scanner sc = new Scanner(System.in);
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
    public void setDetails(){
        System.out.println("Enter First Name : ");
        firstName = sc.next();
        System.out.println("Enter Last Name : ");
        lastName = sc.next();
        if(validFirstName(firstName) && validLastName(lastName)){
            User prakash = new User(firstName,lastName);
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
