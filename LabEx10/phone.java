/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx10;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author Srinithi
 */
public class phone {
    public static void main(String[] args) throws IOException,FileNotFoundException
    {
        Scanner obj=new Scanner(System.in);
        FileWriter f=new FileWriter("Customer Phone Number Detail.txt");
        BufferedWriter b=new BufferedWriter(f);
        String name[]=new String[20];
        String phno[]=new String[20];
        System.out.println("Enter the total number of Customers :");
        int n=obj.nextInt();
        System.out.println("Enter the Customer Details :");
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the name of Customer "+(i+1)+" :");
            name[i]=obj.next();
            System.out.println("Enter the Phone number of "+name[i]+" :");
            phno[i]=obj.next();
        }
        for (int i=0;i<n;i++)
        {
            b.write(name[i]);
            b.write(" :: ");
            b.write(phno[i]);
            b.newLine();
        }
        b.close();
        f.close();
        System.out.println("=======================================================================");
        System.out.println("Enter the name of the customer whose phone number has to be retrieved :");
        String s=obj.next();
        int index=0,flag=0;
        for (int i=0;i<n;i++)
        {
            if (s.equals(name[i]))
            {
                index=i;
                flag=1;
                break;
            }
        }
        if (flag==1)
        {
            System.out.println("Phone number of "+name[index]+" is : "+phno[index]);
        }
        else
        {
            System.out.println("Name Not Found !!!");
        }
    }
}


//Content of the File :
//Abcd :: 9732143432
//Lmno :: 8927435534
//Pqrs :: 8974353465
//Wxyz :: 9248943545


//OUTPUT :
//Enter the total number of Customers :
//4
//Enter the Customer Details :
//Enter the name of Customer 1 :
//Abcd
//Enter the Phone number of Abcd :
//9732143432
//Enter the name of Customer 2 :
//Lmno
//Enter the Phone number of Lmno :
//8927435534
//Enter the name of Customer 3 :
//Pqrs
//Enter the Phone number of Pqrs :
//8974353465
//Enter the name of Customer 4 :
//Wxyz
//Enter the Phone number of Wxyz :
//9248943545
//=======================================================================
//Enter the name of the customer whose phone number has to be retrieved :
//Lmno
//Phone number of Lmno is : 8927435534