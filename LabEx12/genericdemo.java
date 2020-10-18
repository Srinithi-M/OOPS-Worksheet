/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx12;

import java.util.Scanner;
/**
 *
 * @author Srinithi
 */
public class genericdemo {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=obj.nextInt();
        Integer arr[]=new Integer[n];
        System.out.println("Enter the elements of the array : ");
        for (int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("The Array is : ");
        for (int i:arr)
        {
            System.out.print(i+" ");  
        }
        System.out.println("\n======Number of Odd Numbers in the Array======");
        generic<Integer> g=new generic<>();
        System.out.println("Number of odd integers in the Array is : "+g.odd(arr));
        System.out.println("======Exchange the Positions of Two Different Elements in the Array======");
        System.out.println("Enter the first index : ");
        int x=obj.nextInt();
        System.out.println("Enter the second index : ");
        int y=obj.nextInt();
        System.out.println("After Exchanging the elements in the positions "+x+" & "+y+" , the Array is : ");
        g.exchange(arr,x,y);
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n======Maximal Element in a Range in the Array======");
        System.out.println("Enter the starting index of the range : ");
        int begin=obj.nextInt();
        System.out.println("Enter the ending index of the range : ");
        int end=obj.nextInt();
        System.out.println("Elements inbetween the range["+begin+","+end+"] are :");
        for (int i=begin;i<end;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nMaximal element : "+g.max(arr,begin,end));
    }
}
class generic<T>
{
    int count,a,b,begin,end;
    public <T extends Number> int odd(T[] value)
    {
        for (T i:value) 
        {
            if (i.intValue()%2!= 0) 
            {
                count++;
            }
        }
        return count;
    }
    public <T> void exchange(T[] value,int a,int b)
    {
        T temp=value[a];
        value[a]=value[b];
        value[b]=temp;
    }
    public <T extends Number> int max(T[] value,int begin,int end)
    {
        int max=value[begin].intValue();
        for (int i=begin;i<end;i++)
        {
            if (value[i].intValue()>max)
            {
                max=value[i].intValue();
            }
        }
        return max;
    }
}