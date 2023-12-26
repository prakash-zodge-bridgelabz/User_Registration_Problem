package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

// Use Case 6:
// Rule 2
// – Should have at least 1 Upper Case
// - NOTE – All rules must be passed
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
            System.out.println("Invalid Last Name");
            return false;
        }
    }
    public boolean validEmail(String email){
        if(Pattern.matches("^[A-Za-z0-9.]+@(.+)$",email)){
            return true;
        }
        else {
            System.out.println("Invalid Email");
            return false;
        }
    }
    public boolean validMobile(String mobileNumber){
        if(Pattern.matches("^[9]{1}[1]{1}\\s[0-9]{10}$",mobileNumber)){
            return true;
        }
        else {
            System.out.println("Invalid Mobile Number");
            return false;
        }
    }
    //Atleast 1 upper case & Minimum 8 characters
    public boolean validPassword(String password){
        if(Pattern.matches("(([A-Z]+)([a-z]{7,}))",password)){
            return true;
        }
        else {
            System.out.println("Invalid Password");
            return false;
        }
    }
    String firstName,lastName,email,mobileNumber,password;
    Scanner sc = new Scanner(System.in);
    public void setDetails(){
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
        if(validFirstName(firstName) && validLastName(lastName) && validEmail(email) &&
                validMobile(mobileNumber) && validPassword(password)){
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
        validateUser v = new validateUser();
        v.setDetails();
    }
}
