/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loan;
import java.util.Scanner;
import com.transact.Transaction;
import com.MainClass;
/**
 *
 * @author Srinithi
 */
public class LoanAccount 
{
   
    public void doTransactions()
    {
        int ac;
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter the account number from which the Amount has to be credited : ");
        ac=obj.nextInt();
        Transaction.credit();
        System.out.println("Amount Credited Successfully !!!");
        System.out.println("Enter the account number from which the Amount has to be debited : ");
        ac=obj.nextInt();
        Transaction.debit();
        System.out.println("Amount Debited Successfully !!!");
    }
}
