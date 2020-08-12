/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx3;

import java.util.Scanner;/**
 *
 * @author Rajasekar
 */
public class maj {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter three BOOLEAN values:");
        major.a=obj.nextBoolean();
        major.b=obj.nextBoolean();
        major.c=obj.nextBoolean();
        System.out.println("Majority-->"+major.majority());
    }
}
class major
{
    static boolean a,b,c;
    static boolean majority()
    {
        return (a&b==true || b&c==true || a&c==true);
    }
}
