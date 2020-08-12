/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx2;

import java.util.Scanner;/**
 *
 * @author Rajasekar
 */
public class rect {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(1,1);
        System.out.println("Before Changing the values of length & width:\n"+r1);
        r1.setLength(2);
        r1.setWidth(4);
        System.out.println("After Changing the values of length & width:\n"+r1);
        
    }
}
class Rectangle
{
    float length;
    float width;
    Rectangle(float l,float w)
    {
        length=l;
        width=w;
    }
    float getLength()
    {
        return length;
    }
    float getWidth()
    {
        return width;
    } 
    void setLength(float l1)
    {
        length=l1;
    }
    void setWidth(float w1)
    {
        width=w1;
    }
    double getArea()
    {
        return  length*width; 
    }
    double getPerimeter()
    {
        return 2*(length+width);
    }
    public String toString()
    {
        return "Rectangle:\nLength:"+length+"\nWidth:"+width+"\nArea:"+getArea()+"\nPerimeter:"+getPerimeter();
    }
}

