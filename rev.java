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
public class rev {
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
        System.out.println("After reversing the array:");
        for (i=n-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }    
        }    
        
    }
    

