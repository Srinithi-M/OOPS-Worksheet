/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx2;

import java.util.Scanner;/**
 *
 * @author Rajasekar
 */
public class comp {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        COMPLEX c1=new COMPLEX();
        System.out.println("Enter the real part of the first complex number:");
        c1.r1=obj.nextInt();
        System.out.println("Enter the imaginary part of the first complex number:");
        c1.i1=obj.nextInt();
        System.out.println("Enter the real part of the second complex number:");
        c1.r2=obj.nextInt();
        System.out.println("Enter the imaginary part of the second complex number:");
        c1.i2=obj.nextInt();
        c1.display();
        c1.add();
        c1.sub();
        c1.mul();
        c1.div();
    }
}
class COMPLEX
{
    int r1;
    int i1;
    int r2;
    int i2;
    COMPLEX (int a,int b,int c,int d)
    {
        r1=a;
        i1=b;
        r2=c;
        i2=d;
    }
    COMPLEX()
    {
    }
    void display()
    {
        System.out.println("The two complex numbers are:\n"+r1+"+i"+i1+" & "+r2+"+i"+i2);
    }
    void add()
    {
       int x,y;
       x=r1+r2;
       y=i1+i2;
       System.out.println("Addition of the two complex numbers--> "+x+"+i"+y);
    }
    void sub()
    {
        int x,y;
        x=r1-r2;
        y=i1-i2;
        System.out.println("Subtraction of the two complex numbers--> "+x+"+i"+y);
    }
    void mul()
    {
        int x,y;
        x=(r1*r2)-(i1*i2);
        y=(r1*i2)+(i1*r2);
        System.out.println("Multiplication of the two complex numbers--> "+x+"+i"+y);
    }
    void div()
    {
        int a,b;
        float x,y,m;
        m=(r2*r2)+(i2*i2);
        a=(r1*r2)+(i1*i2);
        x=a/m;
        b=(r1*i2)-(r2*i1);
        y=b/m;
        System.out.println("Division of the two complex numbers--> "+x+"+i"+y);
    }
}
