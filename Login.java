/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registration;
import java.util.Scanner;
/**
 *
 * @author jabul
 */
public class Login {
    //Attributes
    private String pass;
    private String name;
    private String numbers;
    
   //Constructor
    /*public Login(String username,String password, String phoneNumber){
    pass = password;
    name = username;
    numbers = phoneNumber;
    }*/
    
    //Setters
    public void setPass(String password){
        pass = password;
    }
    
    public void setName(String username){
        name = username;
    }
    
    public void setNumbers(String phoneNumber){
        numbers = phoneNumber;
    }
    
    //Getters
    public String getPass(){
        return pass;
    }
    
    public String getName(){
        return name;
    }
      
    public String getNumbers(){
        return numbers;
    }
    
    //This method is going to prompt the user to login to their account.
    public boolean Account(){
        Scanner Input = new Scanner(System.in);
        System.out.println("===========LOGIN=======");
        int logattempts = 0;
        int maxattempts = 20;
        String user2;
        String pass2;
        boolean success = false;
        while(logattempts < maxattempts){
            System.out.println("Enter your username: ");
            user2 = Input.nextLine();
            System.out.println("Enter your password: ");
            pass2 = Input.nextLine();
            
            if(user2.equals(name) && pass2.equals(pass)){
                System.out.println("Welcome to quick chat.");
                success = true;
                break;
            }else{
                logattempts++;
                System.out.println("Username or password incorrect, please try again.");
            }
            
        }
        return success;
    }
  
    
    
}
