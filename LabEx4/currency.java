/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx4;

import java.util.Scanner;/**
 *
 * @author Srinithi
 */
public class currency {

    /**
     * @param args the command line arguments
    */
    public double rupee;
    public static void main(String[] args) {
        // TODO code application logic here
        double dollar,yen,euro;
        converter obj1=new converter();
        Scanner obj=new Scanner(System.in);
        System.out.println("-----Currency converter-----");
        System.out.println(obj1.dollar());
        System.out.println(obj1.euro());
        System.out.println(obj1.yen());
        System.out.println("Enter the amount in US Dollar:");
        dollar=obj.nextDouble();
        System.out.println(obj1.rupee1(dollar));
        System.out.println("Enter the amount in Euro:");
        euro=obj.nextDouble();
        System.out.println(obj1.rupee2(euro));
        System.out.println("Enter the amount in Japanese Yen:");
        yen=obj.nextDouble();
        System.out.println(obj1.rupee3(yen));
    }
}
