/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;

import java.util.Scanner;/**
 *
 * @author Rajasekar
 */
public class volume {
    public static void main(String[] args) {
        box obj=new box();
        obj.depth=10;
        obj.height=20;
        obj.width=30;
        obj.volume();
    }
}
class box
{
    int depth;
    int height;
    int width;
    void volume()
    {
        double volume=depth*height*width;
        System.out.println("Volume :"+volume);
    }
}