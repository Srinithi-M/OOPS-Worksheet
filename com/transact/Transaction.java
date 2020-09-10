/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transact;
import java.util.Scanner;
import com.MainClass;
import com.loan.LoanAccount;
/**
 *
 * @author Srinithi
 */
public class Transaction 
{
    
    public static void debit()
    {
       int d; 
       int ac;
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the Amount to be debited:");
       d=obj.nextInt();
       System.out.println("Enter the account number to which the Amount has to be debited: ");
       ac=obj.nextInt();
    }
    public static void credit()
    {
        int c;
        int ac;
        System.out.println("Enter the amount to be credited:");
        Scanner obj=new Scanner(System.in);
        c=obj.nextInt();
        System.out.println("Enter the account number to which the Amount has to be credited : ");
        ac=obj.nextInt();
    }
}
