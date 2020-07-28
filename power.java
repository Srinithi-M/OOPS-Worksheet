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
public class power {
    public static void main(String[] args) {
        int n=2,p=5,sum=1;
        for (int i=0;i<p;i++)
        {
            sum=sum*n;
        }
        System.out.println(+n+"^"+p+"is:"+sum);
    }
    
}
