/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx1;

import java.util.Scanner;
/**
 *
 * @author Rajasekar
 */
public class word {
    public static void main(String[] args) {
        int n,d,i=0;
        int a[]=new int[10];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter an integer:");
        n=obj.nextInt();
        while (n!=0)
        {
            d=n%10;
            a[i]=d;
            n=n/10;
            i++;
        }
        System.out.println("The number in words :");
        for (int j=i-1;j>=0;j--)
        {
            switch(a[j])
            {
                case 0:System.out.print("Zero ");
                break;
                case 1:System.out.print("One ");
                break;
                case 2:System.out.print("Two ");
                break;
                case 3:System.out.print("Three ");
                break;
                case 4:System.out.print("Four ");
                break;
                case 5:System.out.print("Five ");
                break;
                case 6:System.out.print("Six ");
                break;
                case 7:System.out.print("Seven ");
                break;
                case 8:System.out.print("Eight ");
                break;
                default:System.out.print("Nine ");
            }
        }
    }
    
}
