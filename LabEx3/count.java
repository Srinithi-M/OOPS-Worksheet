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
public class count {
    public static void main(String[] args) {
       counter obj=new counter();
       System.out.println("After First Increment:");
       obj.increment();
       System.out.println("After Second Increment");
       counter obj1=new counter();
       obj1.increment();
    }
}
class counter
{
    static int i=10;
    int j=10;
    void increment()
    {
        i=i+10;
        j=j+10;
        System.out.println("Static variable(i)-->"+i);
        System.out.println("Non-Static variable(j)-->"+j);
    }
}
