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
public class calc {
    public static void main(String[] args) {
        int a=100,b=50;
        Scanner obj=new Scanner(System.in);
        char c=obj.next().charAt(0);
        switch(c)
        {
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
            default:
        }
    }
    
}
