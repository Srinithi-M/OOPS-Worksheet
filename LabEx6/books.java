/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx6;

import java.util.Scanner;/**
 *
 * @author Srinithi
 */
public class books {
    public static void main(String[] args) {
        Book b1=new MyBook();
        b1.setdetails();
        System.out.println("==============================");
        Book b2=new MyBook();
        b2.setdetails();
        System.out.println("==============================");
        Book b3=new MyBook();
        b3.setdetails();
        System.out.println("==============================");
        int sum=b1.price+b2.price+b3.price;
        System.out.println("Total Price of the 3 Books is : "+sum);        
    }    
}
abstract class Book
{
    String title;
    String author;
    int price;
    Scanner obj=new Scanner(System.in);
    abstract void setdetails();
    abstract String gettitle();
}
class MyBook extends Book
{
    void setdetails()
    {
        gettitle();
        System.out.println("Enter the Name of the Author of the Book:");
        author=obj.next();
        System.out.println("Enter the Price of the Book");
        price=obj.nextInt();
    }
    String gettitle()
    {
        System.out.println("Enter the Title of the Book:");
        title=obj.next();
        return title;
    }
}