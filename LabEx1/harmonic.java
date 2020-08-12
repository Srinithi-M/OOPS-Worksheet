/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx1;

import java.util.Scanner;/**
 *
 * @author Rajasekar
 */
public class harmonic {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n;
        double i,s=0;
        System.out.println("Enter a number:");
        n=obj.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s+(1/i);
        }
        System.out.println("Harmonic series upto "+n+" is: ");
        System.out.println("1/1 + 1/2+....+1/"+n+" = "+s);
        
    }
    
}
