/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx9;
//Write a Java program for handling the following exceptions
//(i) Arithmetic Exception (ii) ArrayIndexOutOfBounds Exception
//(iii) NumberFormatException (iv) StringIndexOutOfBound Exception
import java.util.Scanner;/**
 *
 * @author Srinithi
 */
public class Exceptions {
    public static void main(String[] args) {
        try
        {
            int a=10/0;
        }
        catch (ArithmeticException e) 
        {
            System.out.println(e);
        }
        try 
        {
            int a[]=new int[10];
            a[15]=100;
            System.out.println(a[15]);
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println(e);
        }
        try
        {
            String s="Welcome";
            int ch=Integer.valueOf(s);
        }
        catch (NumberFormatException e) 
        {
            System.out.println(e);
        }
        try
        {
            String str="Hello World";
            System.out.println(str.charAt(20));
        }
        catch (StringIndexOutOfBoundsException e) 
        {
            System.out.println(e);
        }
    }
}
