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
public class min {
    public static void main(String[] args) {
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("The minimum of "+a+" & "+b+" is :"+((a<b)?a:b));
    }
    
}
