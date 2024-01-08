package com.bridgelabz;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

// Use Case 13:
// Refactor the Code to use Lambda Function to validate User Entry
// - Use Lambda Function to validate First Name, Last Name, Email, Mobile, and Password
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
interface isValid{
    boolean isValidFirstName(String firstName)throws InvalidUserDetailsException;
}
class validateUser{
    void validateEntry(String input, Predicate<String>... validations) throws InvalidUserDetailsException{
        for(Predicate<String> validation: validations){
            if(!validation.test(input)){
                System.out.println(input + ": " + "Invalid");
                throw new InvalidUserDetailsException("Invalid");
            }
        }
        System.out.println(input + ": " + "Valid");
    }
    public boolean isValidFirstName(String firstName) throws InvalidUserDetailsException {
        validateEntry(firstName,firstName1 -> Pattern.compile("^[A-Z][a-z]{2,}").matcher(firstName).matches());
        return true;
    }
    public boolean isValidLastName(String lastName) throws InvalidUserDetailsException {
        validateEntry(lastName,lastName1 -> Pattern.compile("^[A-Z][a-z]{2,}").matcher(lastName).matches());
        return true;
    }
    public boolean isValidEmail(String email) throws InvalidUserDetailsException{
        validateEntry(email,email1 -> Pattern.compile("^(?!^[0-9])[A-Za-z0-9.]+@[a-z.]+$").matcher(email).matches());
        return true;
    }
    public boolean isValidMobileNumber(String mobileNumber) throws InvalidUserDetailsException{
        validateEntry(mobileNumber,mobileNumber1 -> Pattern.compile("^[9]{1}[1]{1}\\s[0-9]{10}$").matcher(mobileNumber).matches());
        return true;
    }
    //Atleast 1 upper case & Minimum 8 characters
    // at least 1 numeric number in the password
    // exactly 1 special character
    public boolean isValidPassword(String password)throws InvalidUserDetailsException{
        validateEntry(password,password1 -> Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[!@#$%^&*][^!@#$%^&*]*$)[a-zA-Z0-9!@#$%^&*]{8,}$").matcher(password).matches());
        return true;
    }


//    String firstName,lastName,email,mobileNumber,password;
//    Scanner sc = new Scanner(System.in);
//    public void setDetails() throws InvalidUserDetailsException {
//        System.out.println("Enter First Name : ");
//        firstName = sc.nextLine();
//        System.out.println("Enter Last Name : ");
//        lastName = sc.nextLine();
//        System.out.println("Enter Email : ");
//        email = sc.nextLine();
//        System.out.println("Enter Mobile Number : ");
//        mobileNumber = sc.nextLine();
//        System.out.println("Enter Password : ");
//        password = sc.next();
//        if(isValidFirstName(firstName) && isValidLastName(lastName) && isValidEmail(email) &&
//                isValidMobileNumber(mobileNumber) && isValidPassword(password)){
//            User prakash = new User(firstName,lastName,email,mobileNumber,password);
//            System.out.println(prakash);
//        }
//        else {
//            System.out.println("Invalid Details...");
//        }
//    }
}
public class User_Registration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem...");
    }
}