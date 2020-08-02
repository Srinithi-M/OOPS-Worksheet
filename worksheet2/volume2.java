/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;

import java.util.Scanner;
/**
 *
 * @author Rajasekar
 */
public class volume2 {
    public static void main(String[] args) {
        box1 obj1=new box1();
        obj1.depth=20;
        obj1.height=40;
        obj1.width=60;
        obj1.volume();
        box1 obj2=new box1();
        obj2.depth=10;
        obj2.height=30;
        obj2.width=50;
        obj2.volume();
    }
}
class box1
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
