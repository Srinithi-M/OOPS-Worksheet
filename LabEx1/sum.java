/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx1;

import java.util.Scanner;/**
 *
 * @author Rajasekar
 */
public class sum {
    public static void main(String[] args) {
        int i,s=0;
        for (i=101;i<200;i++)
        {
            if (i%7==0)
            {
                s=s+i;
            }
        }
        System.out.println("The sum numbers between 100 & 200 that are divisible by 7 is:"+s);
    }
    
}
