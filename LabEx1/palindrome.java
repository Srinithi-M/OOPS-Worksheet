/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx1;

import java.util.Scanner;
/**
 *
 
 */
public class palindrome {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n=obj.nextInt();
        int s=0,i,a=n,r;
        
        while (n!=0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if (a==s)
        {
            System.out.println(a+" is a Palindrome");
            
        }
        else
        {
            System.out.println(a+" is not a Palindrome");
        }
    }
    
}
