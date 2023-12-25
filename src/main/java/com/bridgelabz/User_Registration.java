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
    String firstName,lastName,email,mobileNo;
    Scanner sc = new Scanner(System.in);
    public void setDetails(){
        System.out.println("Enter First Name : ");
        firstName = sc.next();
        System.out.println("Enter Last Name : ");
        lastName = sc.next();
        System.out.println("Enter Email : ");
        email = sc.next();
        System.out.println("Enter Mobile Number : ");
        mobileNo = sc.next();
        boolean correctFirstName = Pattern.matches("^[A-Z][a-z]{2,}",firstName);
        boolean correctLastName = Pattern.matches("^[A-Z][a-z]{2,}",lastName);
        boolean correctEmail = Pattern.matches("^[A-Za-z0-9.]+@(.+)$",email);
        boolean correctMobileNumber = Pattern.matches("^[9]{1}[1]{1}\s[0-9]{10}",mobileNo);
        if(correctFirstName && correctLastName && correctEmail && correctMobileNumber){
            User prakash = new User(firstName,lastName,email,mobileNo);
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
