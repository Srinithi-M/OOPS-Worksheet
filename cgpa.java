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
public class cgpa {
    public static void main(String[] args) {
        double m[]=new double[10];
        double c[]=new double[10];
        double sum=0,csum=0;
        int i;
        System.out.println("Enter the number of subjects:");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for (i=0;i<n;i++)
        {
            System.out.println("Enter the Grade & Credit for "+(i+1)+" Subject:");
            m[i]=obj.nextDouble();
            c[i]=obj.nextDouble();
            sum=sum+(m[i]*c[i]);
            csum=csum+c[i];
        }
        System.out.println("CGPA-->"+(sum/csum));
    }
    
}
