/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx9;

import java.util.Scanner;/**
 *
 * @author Srinithi
 */
public class PrimeNumber {
    public static void main(String[] args) { 
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the First Integer :");
        int a=obj.nextInt();
        System.out.println("Enter the Second Integer :");
        int b=obj.nextInt();
        if (a<=0 || b<=0)
        {
            throw new ArithmeticException ("INVALID INPUT !!! Both the integers should be POSITIVE");
        }
        else if (b<=a)
        {
           throw new ArithmeticException ("INVALID INPUT !!! Second integer should be GREATER THAN first integer"); 
        }
        else
        {
            int f;
            System.out.println("VALID INPUT");
            System.out.println("Prime Numbers between "+a+" and "+b+" are :");
            for (int i=a;i<=b;i++)
            {
                if (i==1 || i==0)
                {
                    continue;
                }
                f=1;
                for (int j=2;j<=i/2;j++)
                {
                    if (i%j==0)
                    {
                        f=0;
                        break;
                    }
                }
                if (f==1)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
