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
public class disc {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the amount:");
        double d=obj.nextDouble();
        System.out.println("Enter the discount %:");
        double d1=obj.nextDouble();
        double discount=d/100*d1;
        System.out.println("Commission amount:"+(d-discount));
    }
    
}
