/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx3;

import java.util.Scanner;
/**
 *
 * @author Rajasekar
 */
public class nearestint {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a float value :");
        nearint.x=obj.nextFloat();
        System.out.println("The nearest integer to "+nearint.x+" is :"+nearint.nint());
    }
}
class nearint
{
   static float x;
   static int nint()
   {
       return Math.round(x);
   }
}
   