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
public class sort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char ch;
        System.out.println("======Sorintg of an array of elements in Descending Order :======");
        System.out.println("Options :");
        System.out.println("1.Integer Sorting");
        System.out.println("2.Float Sorting");
        System.out.println("3.Double Sorting");
        System.out.println("4.Short Sorting");
        System.out.println("5.Byte Sorting");
        System.out.println("Enter a number from 1 to 5 to perform the Corresponding Sorting Operation :");
        int a = obj.nextInt();
        switch (a) 
        {
            case 1: 
            {
                System.out.println("======Descending Order Sorting of Integer Elements======");
                System.out.println("Enter the size of the array : ");
                int n = obj.nextInt();
                Integer arr[] = new Integer[n];
                System.out.println("Enter the elements of the array : ");
                for (int i = 0; i < n; i++) 
                {
                    arr[i] = obj.nextInt();
                }
                System.out.println("The Array is :");
                for (int i : arr) 
                {
                    System.out.print(i + "  ");
                }
                descend<Integer> o1 = new descend<>();
                o1.sorting(arr);
                break;
            }
            case 2: 
            {
                System.out.println("======Descending Order Sorting of Float Elements======");
                System.out.println("Enter the size of the array :");
                int n = obj.nextInt();
                Float arr[] = new Float[n];
                System.out.println("Enter the elements of the array :");
                for (int i = 0; i < n; i++) 
                {
                    arr[i] = obj.nextFloat();
                }
                System.out.println("The Array is :");
                for (float i : arr) 
                {
                    System.out.print(i + "  ");
                }
                descend<Float> o2 = new descend<>();
                o2.sorting(arr);
                break;
            }
            case 3: 
            {
                System.out.println("======Descending Order Sorting of Double Elements======");
                System.out.println("Enter the size of the array :");
                int n = obj.nextInt();
                Double arr[] = new Double[n];
                System.out.println("Enter the elements of the array :");
                for (int i = 0; i < n; i++) 
                {
                    arr[i] = obj.nextDouble();
                }
                System.out.println("The Array is :");
                for (double i : arr) 
                {
                    System.out.print(i + "  ");
                }

                descend<Double> obj2 = new descend<>();
                obj2.sorting(arr);
                break;
            }
            case 4: 
            {
                System.out.println("======Descending Order Sorting of Short Elements======");
                System.out.println("Enter the size of the array :");
                int n = obj.nextInt();
                Short arr[] = new Short[n];
                System.out.println("Enter the elements of the array :");
                for (int i = 0; i < n; i++) 
                {
                    arr[i] = obj.nextShort();
                }
                System.out.println("The Array is :");
                for (short i : arr) 
                {
                    System.out.print(i + "  ");
                }
                descend<Short> obj5 = new descend<>();
                obj5.sorting(arr);
                break;
            }
            case 5: 
            {
                System.out.println("======Descending Order Sorting of Byte Elements======");
                System.out.println("Enter the size of the array :");
                int n = obj.nextInt();
                Byte arr[] = new Byte[n];
                System.out.println("Enter the elements of the array :");
                for (int i = 0; i < n; i++) 
                {
                    arr[i] = obj.nextByte();
                }
                System.out.println("The Array is :");
                for (byte i : arr) 
                {
                    System.out.print(i + "  ");
                }
                descend<Byte> obj4 = new descend<>();
                obj4.sorting(arr);
                break;
            }
            default: 
            {
                System.out.println("Your input is INVALID!!!:(((...Enter the valid input!");
            }
        }
    }
}

class descend<T> 
{

    public <T extends Number> void sorting(T[] value) 
    {
        for (int i = 0; i < value.length; i++) 
        {
            for (int j = i; j < value.length; j++) 
            {
                if (value[i].intValue() < value[j].intValue()) 
                {
                    T temp = value[i];
                    value[i] = value[j];
                    value[j] = (T) temp;
                }
            }
        }
        System.out.println("\n======Array After Sorting in Descending Order======");
        for (T i : value) 
        {
            System.out.print(i + "  ");
        }
    }
}
