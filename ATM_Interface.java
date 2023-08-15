/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_projects;

import java.util.Scanner;

class Account{
    String user_name ; 
    String password;
    int Ac_No;
    Float Balance = 5000000f;
    double Transaction = 0;
    String TransactionHistory = " ";
    
   
    
    
    /*Account(String user_name,String password,int Ac_No){
        this.user_name = user_name;
        this.password = password;
        this.Ac_No = Ac_No;
    }
    */
    public void verify(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter user_name");
        user_name = sc.nextLine();
        System.out.println("enter password");
        password = sc.next();
        System.out.println("enter account number");
        Ac_No = sc.nextInt();
        
    }
    public boolean login(){
       boolean login = false;
        while(!login){
            Scanner s =new Scanner(System.in);
            System.out.println("enter your username ");
            String Username = s.nextLine();
            System.out.println("enter your password1 ");
            String pass = s.next();
            
            if(Username.equals(user_name) && pass.equals(password)){
                System.out.println("Successfully logged in");
                login = true;
                
            }
            else{
                System.out.println("Incorrect username or password");
                login = false;
            }
        }
        return login;
    }
    
    public void withdraw(){
        Scanner c =new Scanner(System.in);
        System.out.println("enter the amount for withdrawal");
        Float amt = c.nextFloat();
        
        if(amt <= Balance ){
            Transaction++;
            Balance = Balance-amt; 
            System.out.println("Bank Balance : "+Balance );
            String s  = amt + "Rs.";
            TransactionHistory = TransactionHistory.concat(s);
            
        }
        else{
            System.out.println("Not Sufficient Balance ");
        }      
    }
    
    public void Deposit(){
        Scanner v =new Scanner(System.in);
        System.out.println("enter the amount to deposit");
        Float amt  = v.nextFloat();
        Transaction++;
        Balance = Balance+amt;
        System.out.println("Bank Balance :  "+Balance);
        String s = amt+"Rs.";
        TransactionHistory = TransactionHistory.concat(s);     
    }
    
    public void Tranfer(){
        Scanner ab =new Scanner(System.in);
        System.out.println("enter the recipient name");
        String R_name = ab.nextLine();
        System.out.println("enter the tranfer amount");
        Float amt = ab.nextFloat();
        if(amt <= Balance){
        Transaction++;
        Balance  = Balance -amt;
        System.out.println("Transferred Rs "+amt + " to "+R_name);
        } 
        else{
            System.out.println("Insufficient Balance");
        }
        
    }
    
    
    public void Transaction_History(){
        if(Transaction == 0){
            System.out.println("No Transactions yet");
        }
        else{
            System.out.println(TransactionHistory);
        }
        
    }
    
}
public class ATM_Interface {
    public static void main(String args[]){
        int ch;
        Account ac = new Account();
        System.out.println("***WELCOME***");
        
        Scanner sin  = new Scanner(System.in);
        
        System.out.println("1.Verify       2.Quit");
        System.out.println("enter choice either 1 or 2");
         ch = sin.nextInt();
        
        if(ch == 1){
            ac.verify();
            boolean Quit = false;
            while(!Quit){
                System.out.println("enter 1->login  2->Quit ");
                 ch = sin.nextInt();
                 if(ch==1){
                     ac.login();
                     boolean exit = false;
                     while(!exit){
                          
                         System.out.println("enter your choise 1->Withdraw  2->Depodit 3->Transfer 4->TransactionHstory 5->exit");
                         ch = sin.nextInt();
                         switch(ch){
                             case 1 -> ac.withdraw();
                                 
                             case 2 -> ac.Deposit();
                                 
                             case 3 -> ac.Tranfer();
                                 
                             case 4 -> ac.Transaction_History();
                             
                             case 5 -> exit = true; 
                                 
                                 
                         }
                     }
                     
                 }
                 else{
                     Quit = true;
                 }
                 
            }
        }
        else{
            System.out.println("Exit");
        }
          
        
    }
}
