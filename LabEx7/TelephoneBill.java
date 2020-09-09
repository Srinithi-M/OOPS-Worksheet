/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx7;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Srinithi
 */
public class TelephoneBill {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<String> month=new ArrayList<>(12);
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("July");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");
        ArrayList<Float> bill=new ArrayList<>(12);
        float b,s=0;
        for(int i=0;i<12;i++)
        {
            System.out.println("Enter the Telephone Bill for the month "+month.get(i)+" : ");
            b=obj.nextFloat();
            bill.add(b);
            s=s+b;
        }
        System.out.println("===========================================");
        System.out.println("Total Telephone Bill Paid for a year : "+s);
        float avg=s/12;
        System.out.println("Average Telephone Bill for a year : "+avg);
        float min=bill.get(0),max=bill.get(0);
        String maxmonth=month.get(0),minmonth=month.get(0);
        for (int i=0;i<12;i++)
        {
            if (bill.get(i)>max)
            {
                max=bill.get(i);
                maxmonth=month.get(i);
            }
            if (bill.get(i)<min)
            {
                min=bill.get(i);
                minmonth=month.get(i);
            }
        }
        System.out.println("Maximum Telephone Bill Paid : "+max+"(in the month : "+maxmonth+")");
        System.out.println("Minimum Telephone Bill Paid : "+min+"(in the month : "+minmonth+")");
    }
}
