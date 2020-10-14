/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx11;

/**
 *
 * @author Srinithi
 */
public class venue {
    public static void main(String[] args) {
        int i=0;
        booking b = new booking();
        abc o1 = new abc(b,i);
        lmn o2 = new lmn(b,i);
        pqr o3 = new pqr(b,i);
        xyz o4 = new xyz(b,i);
        o1.start();
        o2.start();
        o3.start();
        o4.start();
    }
}

class booking
{
    int c=0;
    abc a;
    int getc()
    {
        return c;
    }
    synchronized public void resort(int k)
    {
        if (c<2)
        {
            System.out.println("Successfully Booked !!!");
            c++;
        }
        else
        {
            System.out.println("Booking Closed !!!");
        }
    }
}

class abc extends Thread
{
    booking b;
    int i=0;
    public abc(booking b,int i)
    {
        this.b=b;
        this.i=i;
    }
    public void run()
    {
        b.getc();
        int k=i+1;
        b.resort(k);
    }
}

class lmn extends Thread
{
    booking b;
    int i=0;
    public lmn(booking b,int i)
    {
        this.b=b;
        this.i=i;
    }
    public void run()
    {
        b.getc();
        int k=i+1;
        b.resort(k);
    }
}

class pqr extends Thread
{
    booking b;
    int i=0;
    public pqr(booking b,int i)
    {
        this.b=b;
        this.i=i;
    }
    public void run()
    {
        b.getc();
        int k=i+1;
        b.resort(k);
    }
}

class xyz extends Thread
{
    booking b;
    int i=0;
    public xyz(booking b,int i)
    {
        this.b=b;
        this.i=i;
    }
    public void run()
    {
        b.getc();
        int k=i+1;
        b.resort(k);
    }
}

