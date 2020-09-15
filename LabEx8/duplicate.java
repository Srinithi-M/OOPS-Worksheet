/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx8;

import java.util.Scanner;/**
 *
 * @author Srinithi
 */
public class duplicate {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a String : ");
        StringBuffer sb=new StringBuffer();
        String s=obj.next();
        sb.append(s);
        for (int i=0;i<sb.length();i++)
        {
           for (int j=i+1;j<sb.length();j++)
           {
               if (sb.charAt(i)==sb.charAt(j))
               {
                   sb.delete(j, j+1);
               }
           }
        }
        System.out.println("String After Removing the Duplicate Characters : "+sb);
    }
}

