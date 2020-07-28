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
public class large {
    public static void main(String[] args) {
        int a,b,c;
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        if (a>b && a>c)
            System.out.println("A is the greatest..."+a);
        else if (b>a && b>c)
            System.out.println("B is the greatest..."+b);
        else
            System.out.println("C is the greatest..."+c);
        
        
    }
    
}
