/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx8;

import java.util.Scanner;
/**
 *
 * @author Srinithi
 */
public class intsum {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a line of integers : ");
        String s=obj.nextLine();
        String[] words=s.split("\\s");
        System.out.println("Integers in the String "+s+" are : ");
        for (String i : words)
        {
            System.out.println(i);
        }
        int a[]=new int[20];
        int sum=0;
        for (int i=0;i<words.length;i++)
        {
            a[i]=Integer.valueOf(words[i]);
            sum=sum+a[i];
        }
        System.out.println("Sum of all integers : "+sum);
    }
}
