/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx7;
//Create a student class with name,rollno,cgpa as attributes. Store 20 students information
//in arraylist. Use Comparator interface to sort the names in ascending order.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;/**
 *
 * @author Srinithi
 */
public class StudentDetails {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<student> list=new ArrayList<>(20);
        for (int i=0;i<20;i++)
        {
           
            System.out.println("Enter the Details of Student "+(i+1));
            student s = new student();
            list.add(s);
        }
        System.out.println("===========================================================");
        System.out.println("Student Details Before Sorting :");
        System.out.println(list);
        Collections.sort(list,new namesort());
        System.out.println("===========================================================");
        System.out.println("Student Details After Sorting them in Alphabetical Order :");
        System.out.println(list);
    }
}
class student
{
    String name;
    int rollno;
    float cgpa;
    student()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Name :");
        name=obj.next();
        System.out.println("Roll No. :");
        rollno=obj.nextInt();
        System.out.println("CGPA :");
        cgpa=obj.nextFloat();
        
    }
    public String toString()
    {
        return ("\nName : "+name+"\tRoll No. : "+rollno+"\tCGPA : "+cgpa);
    }
}
class namesort implements Comparator<student>
{
    public int compare(student s1,student s2)
    {
        return s1.name.compareTo(s2.name);
    }
}