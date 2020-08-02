/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;

import java.util.Scanner;
/**
 *
 * @author Rajasekar
 */
public class details {
    public static void main(String[] args) {
        student obj[]=new student[10];
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n=obj1.nextInt();
        for (int i=0;i<n;i++)
        {
            obj[i]=new student();
            obj[i].getdata();
            obj[i].markcal();
            obj[i].display();
        }
    }
}
class student
{
    String name ,dept,status;
    double m1,m2,m3,avg;
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        name=obj.next();
        System.out.println("Enter the department of the student:");
        dept=obj.next();
        System.out.println("Enter the 3 subjects marks of the student:");
        m1=obj.nextDouble();
        m2=obj.nextDouble();
        m3=obj.nextDouble();
    }
    void markcal()
    {
        avg=(m1+m2+m3)/3;
        if (m1<50 || m2<50 || m3<50)
        {
            status="Fail";
        }
        else
        {
            if (avg>=80)
            {
                status="First Class";
            }
            else if (avg>=70 && avg<=79)
            {
                status="Second Class";
            }
            else
            {
                status="Third Class";
            }
        }
    }
    void display()
    {
        System.out.println("NAME :"+name+"\nDEPARTMENT :"+dept+"\nMARKS :\nSUBJECT 1: "+m1+"\nSUBJECT 2 :"+m2+"\nSUBJECT 3 :"+m3+"\nAVERAGE :"+avg+"\nSTATUS :"+status);
    }
}
