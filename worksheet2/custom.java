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
public class custom {
    public static void main(String[] args) {
        customer c1=new customer(101,"AAA",20);
        System.out.println(c1.getid());
        System.out.println(c1.getname());
        System.out.println(c1.getdiscount());
        c1.setdiscount(30);
        System.out.println(c1.getdiscount());
        System.out.println(c1);
        System.out.println("=====================");
        customer c2=new customer(102,"BBB",50);
        System.out.println(c2.getid());
        System.out.println(c2.getname());
        System.out.println(c2.getdiscount());
        System.out.println(c2.setdiscount(40));
        System.out.println(c2);
        System.out.println("=====================");
        invoice in=new invoice(100,c1,5000);
        customer c3=new customer(104,"XXX",40);
        System.out.println(in.getdata());
        System.out.println(in.getcustomer());
        System.out.println(in.getamount());
        in.setamount(7500);
        in.setcustomer(c3);
        System.out.println("Name of the customer:"+in.getcustomername());
        System.out.println("Amount after discount:"+in.getamountafterdiscount());
        System.out.println("=====================");
        invoice in1=new invoice(200,c2,4000);
        customer c4=new customer(105,"ZZZ",30);
        System.out.println(in1.getdata());
        System.out.println(in1.getcustomer());
        System.out.println(in1.getamount());
        in.setamount(6000);
        in.setcustomer(c4);
        System.out.println("Name of the customer:"+in1.getcustomername());
        System.out.println("Amount after discount:"+in1.getamountafterdiscount());
    }
}
class customer
{
    int id;
    String name;
    int discount;
    customer ( int i,String n,int d)
    {
        id=1;
        name=n;
        discount=d;
    }
    int getid()
    {
        return id;
    }
    String getname()
    {
        return name;
    }
     int getdiscount()
    {
        return discount;
    }
    int setdiscount(int d1)
    {
        return discount=d1;
    }
    public String toString()
    {
        return "ID:"+id+"\nName:"+name+"\nDiscount:"+discount;
    }
      
}
class invoice
{
    int id;
    customer o;
    double amount;
    invoice(int i,customer o1,double a)
    {
        id=i;
        o=o1;
        amount=a;
    }
    int getid()
    {
        return id;
    }
    customer getcustomer()
    {
        return o;
    }
    void setcustomer(customer o2)
    {
        o=o2;
    }
    int getdata()
    {
        return id;
    }
    double getamount()
    {
        return amount;
    }
    void setamount(double a1)
    {
        amount=a1;
    }
    String getcustomername()
    {
        return o.name;
    }
    double getamountafterdiscount()
    {
        return (amount-((amount*o.discount)/100));
    }
}

