package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

// Use Case 7:
// Rule 3
// – Should have at least 1 numeric number in the password
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
<<<<<<< HEAD
class validateUser{
    String firstName,lastName,email,mobileNo,password;
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
        System.out.println("Enter Password : ");
        password = sc.next();
        boolean correctFirstName = Pattern.matches("^[A-Z][a-z]{2,}",firstName);
        boolean correctLastName = Pattern.matches("^[A-Z][a-z]{2,}",lastName);
        boolean correctEmail = Pattern.matches("^[A-Za-z0-9.]+@(.+)$",email);
        boolean correctMobileNumber = Pattern.matches("^[9]{1}[1]{1}\s[0-9]{10}",mobileNo);
        //                                              //Atleast 1 upper case & Minimum 8 characters
                                                        //at least 1 numeric number in the password
        boolean correctPassword = Pattern.matches("[A-Z]{1,}[a-z0-9]{7,}",password);
        if(correctFirstName && correctLastName && correctEmail && correctMobileNumber && correctPassword){
            User prakash = new User(firstName,lastName,email,mobileNo,password);
=======
class validUser{
    public boolean validFirstName(String firstName){
        if(Pattern.matches("^[A-Z][a-z]{2,}",firstName)){
            User prakash = new User(firstName);
>>>>>>> UC_1_User_need_to_enter_valid_first_name
            System.out.println(prakash);
            return true;
        }
        else {
<<<<<<< HEAD
            System.out.println("Invalid Details...");
=======
            System.out.println("Invalid First Name");
            return false;
>>>>>>> UC_1_User_need_to_enter_valid_first_name
        }
    }
}
public class User_Registration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem");
<<<<<<< HEAD
        validateUser v = new validateUser();
        v.setDetails();
=======

        String firstName;
        Scanner sc = new Scanner(System.in);
        validUser u = new validUser();

        System.out.println("Enter First Name : ");      firstName = sc.next();      u.validFirstName(firstName);
>>>>>>> UC_1_User_need_to_enter_valid_first_name
    }
}
