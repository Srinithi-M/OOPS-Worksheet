/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Create a package named ‘com’. Define subpackages;
//‘transact’: with class ‘Transaction’ with static methods credit() and debit()
//‘loan’: with class ‘LoanAccount’ with method doTransaction() which calls Transaction class methods.
//Create one ‘LoanAccount’ object in main to perform operations on it by accepting command line arguments
package com;
import java.util.Scanner;
import com.loan.LoanAccount;
import com.transact.Transaction;
/**
 *
 * @author Srinithi
 */
public class MainClass 
{
    public static void main(String[] args)
    {
        LoanAccount obj1=new LoanAccount();
        obj1.doTransactions();
    }
}
