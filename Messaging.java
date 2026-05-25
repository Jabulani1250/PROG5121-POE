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
public class Messaging {
    private String cell;
    private String account;
    String msgs;
     String[] messages = new String[250];
    int messageCount = 0;
    Scanner Input = new Scanner(System.in);
    
    
  //Constructor
    public Messaging(String phoneNumber, String username){
        cell = phoneNumber;
        account = username;
    } 
    
    public void sentMessage(){
   while(true){
    System.out.println("1.Sent a message.");
    System.out.println("2.View number of message sent.");
    System.out.println("3.Delete a message.");
    System.out.println("4.Enter 4 to exit.");
    
    int choice = Input.nextInt();
    switch(choice){
        case 1 -> sendingMessage();
        case 2 -> viewingMessage();
        case 3 -> deletingMessage();
        case 4 ->{
            System.out.println("Goodbye.");
            return;
        }
        default -> System.out.println("Invalid option.");
            
            
            
    }
    
   }
 }
    public String checkRecipientCell(){
        if(cell.startsWith("+27") && cell.length()==12){
        return cell;
        }else{
        System.out.println("Cell number not correctly formatted.");
        }
     return null;
 }  
    
    public void sendingMessage(){
    Input.nextLine();
    System.out.println("Type bye to exit.");
    while(true){
    System.out.print("Enter message: ");
    msgs = Input.nextLine();
    
    
    
    //this if else statement will check if the message is bye or what, if the message is bye it will terminate the loop.
    //Using else if statement to communicate with the user.
    if(msgs.equalsIgnoreCase("bye")){
        break;
    }else if(msgs.toLowerCase().contains("hello")){
        System.out.println("Bot: hi " + account);
    }else if(msgs.contains("hi")){
        System.out.println("Bot: hello " + account);
    }else if(msgs.toLowerCase().contains("how are you")){
        System.out.println("Bot: I'm good and how are you?");
    }else if(msgs.contains("I'm doing")){
        System.out.println("Bot: I'm glad you are doing good");
    }
    
    //This block of code will add the messages inside the message array.
    messages[messageCount] = msgs;
    messageCount++;
    }
  }
    //This method will show the messages that were send by the user.
    public  void viewingMessage(){
        if(messageCount ==0){
        System.out.println("No messages.");
            //return null;
        }else{
        for (int i = 0; i < messageCount; i++) {
        System.out.println(messages[i]);
            }
        }
            
        
        
    }
  
    //This method will delete messages but it will follow instructions given by the user.
    public void deletingMessage(){
        
       //This will check if there is any messages if not not it will print " No messages".
      if(messageCount ==0){
          System.out.println("No message.");
          return;
        }  
      
        //This will show the user their messages and the message number.
        System.out.println("Messages:");
        for (int i = 0; i < messageCount; i++) {
            System.out.println((i + 1) + "." + messages[i]);
        }
        
        //It will prompt the user to enter the message number then it will delete the message.
        System.out.println("Choose a message to delete: ");
        int index = Input.nextInt();
        index--;
        
        if(index<0 || index>= messageCount){
            System.out.println("No message to delete.");
            return;
        }
        for (int i = index; i < messageCount - 1; i++) {
           messages[i] = messages[i + 1]; 
        }
        
        messages[messageCount - 1] = null;
        messageCount--;
      
    }
}
