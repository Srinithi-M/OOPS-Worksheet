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
public class sum {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=obj.nextInt();
        int s=0;
        for (int i=0;i<=n;i++)
            s=s+i;
        System.out.println("The sum of numbers from 0 to "+n+" is:"+s);
    }
    
}
