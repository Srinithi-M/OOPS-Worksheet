/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;

import java.util.Scanner;/**
 *
 * @author Rajasekar
 */
public class arithmetic {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        method a=new method();
        System.out.println("Enter 2 numbers:");
        int x=obj.nextInt();
        int y=obj.nextInt();
        System.out.println("Addition of "+x+" & "+y+" is :"+a.add(x, y));
        System.out.println("Subtraction of "+x+" & "+y+" is :"+a.sub(x, y));
        System.out.println("Multiplicatiom of "+x+" & "+y+" is :"+a.multiply(x, y));
        System.out.println("Division of "+x+" & "+y+" is :"+a.divide(x, y));
    }
}
class method
{
    int x;
    int y;
    int z;
    int add(int x,int y)
    {
       return z=x+y; 
    }
    int sub(int x,int y)
    {
        return z=x-y;
    }
    int multiply(int x,int y)
    {
        return z=x*y;
    }
    int divide(int x,int y)
    {
        return z=x/y;
    }
}
