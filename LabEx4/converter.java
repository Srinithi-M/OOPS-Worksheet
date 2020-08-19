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
public class converter {
    double rupee,rupee1,dollar,euro,yen;
    currency obj2=new currency();
    Scanner obj=new Scanner(System.in);
    public double dollar()
    {
        System.out.println("Enter the amount in Indian Rupees:");
        obj2.rupee=obj.nextDouble();
        System.out.println("Indian Rupee converted to US Dollar:");
        return dollar=obj2.rupee/70;
    }
    public double euro()
    {
        System.out.println("Indian Rupee converted to Euro:");
        return euro=obj2.rupee/80;
    }
    public double yen()
    {
        System.out.println("Indian Rupee converted to Japanese Yen:");
        return yen=obj2.rupee/0.63;
    }
    public double rupee1(double dollar)
    {
        
        System.out.println("US Dollar converted to Indian Rupee:");
        return rupee1=dollar*70;
    }
    public double rupee2(double euro)
    {
        rupee1=0;
        System.out.println("Euro converted to Indian Rupee:");
        return rupee1=euro*80;
    }
    public double rupee3(double yen)
    {
        rupee1=0;
        System.out.println("Japanese Yen converted to Indian Rupee:");
        return rupee1=yen*0.63;
    }
    public static void main(String[] args)
    {
    }
}
