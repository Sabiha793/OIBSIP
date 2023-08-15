/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_projects;

import java.util.Random;
import java.util.Scanner;


public class Number_guessing_game{
    
    
    /*JFrame F = new JFrame("Number Guessing Game ");
    JLabel l1 = new JLabel("enter your number");
    l1.setBound(20,150,200,50);
    JTextField = new TextField();
    */
    
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       
       
       int guess;
       int score =0;
       int n = 5;
       Random randnum = new Random();
       
       System.out.println("-----------WELCOME USER-----------");
       System.out.println("---------GUESSS THE NUMBER----------");
       System.out.println("YOU HAVE TO GUESS THE NUMBER.....");
       System.out.println("YOU HAVE ONLY 5 CHANCES TO GUESS THE CORRECT NUMBER.....");
       
       for(int i =1 ;i<= n;i++){
       System.out.println("-----Enter the number in range 0-10-------");
       guess = sc.nextInt();
   
        // get number between 0-99
        int num = randnum.nextInt(10);
         
        System.out.println
        ("Random number between 1 and 10: " + num);
       
       if(guess==num){
           System.out.println("--CONGRATULATIONS--");
           System.out.println("YOU GUESSED IT RIGHT!");
           score = score + 2;
           
       }
       else if(guess>num){
           System.out.println("**OOPS!**");
           System.out.println("YOU MISSED IT");
           System.out.println("YOUR GUESS IS HIGHER");
           score = 0;           
       }
       else if(guess<num){
           System.out.println("**OOPS!**");
           System.out.println("YOU MISSED IT");
           System.out.println("YOUR GUESS IS LOWER");
           score =  0;           
       }
            System.out.println("Score is : "+score);
       }
       System.out.println();
    }
}
