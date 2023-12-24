package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

// Use Case 1 :
// As a User need to enter a valid First Name
//- First name starts with Cap and has minimum 3 characters
class User{
    String first_name;
    User(String first_name){
        this.first_name = first_name;
    }
    @Override
    public String toString() {
        return "First Name : "+first_name;
    }
}
public class User_Registration {
    String firstName;
    Scanner sc = new Scanner(System.in);
    public void setFirstName(){
        System.out.println("Enter First Name : ");
        firstName = sc.next();
        if(Pattern.matches("^[A-Z][a-z]{2,}",firstName)){
            User prakash = new User(firstName);
            System.out.println(prakash);
        }
        else {
            System.out.println("Invalid First Name");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem");
        User_Registration u = new User_Registration();
        u.setFirstName();
    }
}
