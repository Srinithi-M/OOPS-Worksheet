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
public class distance {
    public static void main(String[] args) {
        int x1=0,x2=3,y1=4,y2=0;
        double dist=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("The distance between the 2 points is:"+dist);
    }
    
}
