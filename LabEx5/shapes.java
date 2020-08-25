/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx5;

import java.util.Scanner;/**
 *
 * @author Srinithi
 */
public class shapes {
    public static void main(String[] args) {
        circle a=new circle();
        a.area();
        a.circumference();
        System.out.println("=======================");
        square b=new square();
        b.area();
        b.diagonal();
        System.out.println("=======================");
        sphere c=new sphere();
        c.volume();
        c.surfacearea();
    }
}
class shape
{
    int dimension;
    shape()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number:");
        dimension=obj.nextInt();
    }
}
class circle extends shape
{
    void area()
    {
        double a=Math.PI*dimension*dimension;
        System.out.println("Area of the Circle with Radius "+dimension+" is: "+a );
    }
    void circumference()
    {
        double c=2*Math.PI*dimension;
        System.out.println("Circumference of the Circle with Radius "+dimension+" is: "+c);
    }
}
class square extends shape
{
    void area()
    {
        int a=dimension*dimension;
        System.out.println("Area of the Square of Side "+dimension+" is: "+a);
    }
    void diagonal()
    {
        double d=dimension*Math.sqrt(2);
        System.out.println("Length of the Diagonal of the Square of side "+dimension+" is: "+d);
    }
}
class sphere extends shape
{
    void volume()
    {
        double v=(4*Math.PI*dimension*dimension*dimension)/3;
        System.out.println("Volume of the Sphere of Radius "+dimension+" is: "+v);
    }
    void surfacearea()
    {
        double s=4*Math.PI*dimension*dimension;
        System.out.println("Surface Area of the Sphere of Radius "+dimension+" is: "+s);
    }
}