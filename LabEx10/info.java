/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx10;

import java.io.File;
import java.util.Scanner;/**
 *
 * @author Srinithi
 */
public class info {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Name of the File :");
        String filename=obj.next();
        File f=new File(filename);
        System.out.println("Informations About the File are :");
        System.out.println("Availability of the File : "+f.exists());
        System.out.print("Operating Mode of the File : ");
        if (f.canRead() && f.canWrite())
        {
            System.out.println("Readable And Writable");
        }
        else if (f.canRead())
        {
            System.out.println("Readable");
        }
        else if (f.canWrite()) 
        {
            System.out.println("Writable");
        }
        else
        {
            System.out.println("Undefined");
        }
        System.out.print("Type of the File : ");
        int i=filename.lastIndexOf(".");
        if (i>0)
        {
            System.out.println(filename.substring(i+1));
        }
        System.out.println("Length of the File in Bytes : "+f.length()+" bytes");
    }    
}

//OUTPUT:
//Enter the Name of the File :
//flower.jpg
//Informations About the File are :
//Availability of the File : true
//Operating Mode of the File : Readable
//Type of the File : jpg
//Length of the File in Bytes : 17056 bytes