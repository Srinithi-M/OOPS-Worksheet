/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;

import java.util.Scanner;
/**
 *
 * @author Rajasekar
 */
public class sort {
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
        int temp;
        for (i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if (a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }    
            }     
        }
        System.out.println("The sorted array is");
        for (i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
