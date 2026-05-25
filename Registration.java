/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registration;
import java.util.Scanner;
/**
 *
 * @author jabul
 */
public class Registration {

    public static void main(String[] args) {
        //Declaration
        String username ="";
        String password = "";
        String phoneNumber = "";
        
        System.out.println("==============REGISTER==============");
        
        //This method will show the user the consitions for creating the username.
        usernameConditions();
        
        //This method will prompt the user to create a username and it will check if it meets the condition.
        username = checkUserName(username);
        
        //This will show the user the conditions on creating a strong password.
        passwordConditions();
        
        //This method will prompt the user to create a password.
        password = checkPasswordComplexity(password);
        
        //This method will prompt the user to enter their phone number and it will check if it meets the conditions.
        phoneNumber = checkCellNumber(phoneNumber);
        
        
        //This following block of code will show the user their account details
        System.out.println("==============================================================================================");
        System.out.println("Acount details");
        System.out.println("Username: " + username);
        System.out.println("Psaaword: " + password);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("==============================================================================================");
        
       Login Details = new Login();
       Details.setName(username);
       Details.setPass(password);
       Details.Account();
    
    
    
    
    
    
    
    
    
    
    
    }
    static void usernameConditions(){
        System.out.println("==============================================================================================");
        System.out.println("*Username must be less than or equals to 5 characters.");
        System.out.println("*Username must contain an underscore.");
        System.out.println("==============================================================================================");
    }
    static String checkUserName(String username){
        Scanner Input = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.print("Create a username: ");
            username = Input.nextLine();
            
            if(username.contains("_") && username.length()<=5){
                System.out.println("Username successfully captured.");
                break;
            }else{
                System.out.println("Username is not correctly formatted; please ensure that your username contain an underscore and is no longer than five characters in length.");
            }
        }
        return username;
    }
    static void passwordConditions(){
        System.out.println("===============================================================================================");
        System.out.println("*Password must contain a special character.");
        System.out.println("*Password must contain a number.");
        System.out.println("*Password must conatin a capital letter.");
        System.out.println("*Password must be eight characters long.");
        System.out.println("===============================================================================================");
        }
    static String checkPasswordComplexity(String password){
        Scanner Input = new Scanner(System.in);
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Create a password: ");
            password = Input.nextLine();
            
            boolean longEnough = password.length()<=8;
            boolean hasUppercase = password.matches(".*[A-Z].*");
            boolean hasNumber = password.matches(".*\\d.*");
            boolean hasSpecialchar = password.matches(".*[!@#$^&*_-].*");
            
            if(longEnough && hasNumber && hasUppercase && hasSpecialchar){
                System.out.println("Password successfully captured.");
                break;
            }else{
                System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, capital letter, a number and a special character.");
            }
        }
        return password;
    }
    static String checkCellNumber(String phoneNumber){
        Scanner Input = new Scanner(System.in);
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter your phone number: ");
            phoneNumber = Input.nextLine();
            
            if(phoneNumber.startsWith("0") && phoneNumber.length()==10 || phoneNumber.startsWith("+27") && phoneNumber.length()==12){
                System.out.println("Phone number successfully captured.");
                break;
            }else{
                System.out.println("Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.");
            }
        }
        
        return phoneNumber;
    }
}
