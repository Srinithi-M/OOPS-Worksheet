/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx5;

/**
 *
 * @author Srinithi
 */
public class override {
    public static void main(String[] args) {
        Bond a[]=new Bond[6];
        a[0]=new Bond();
        a[1]=new ConvertibleBond();
        a[2]=new Bond();
        a[3]=new ConvertibleBond();
        a[4]=new Bond();
        a[5]=new ConvertibleBond();
    for (int i=0;i<6;i++)
    {
        a[i].display();
    }
    }
}

class Bond
{
    void display()
    {
        System.out.println("Bond");
    }
}
class ConvertibleBond extends Bond
{
    void display()
    {
        System.out.println("ConvertibleBond");
    }   
}