/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;

import java.util.Scanner;/**
 *
 * @author Rajasekar
 */
public class count {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=obj.nextInt();
        int a[]=new int[10];
        int i;
        System.out.println("Enter the elements of the array:");
        for (i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        int p=0,m=0,z=0;
        for (i=0;i<n;i++)
        {
            if (a[i]>0)
            {
                p++;
            }
            else if (a[i]<0)
            {
                m++;
            }
            else
            {
                z++;
            }
        }
        System.out.println("Number of positive elements:"+p);
        System.out.println("Number of negative elements:"+m);
        System.out.println("Number of zeros:"+z);
        
        }
        
    }
    
    

