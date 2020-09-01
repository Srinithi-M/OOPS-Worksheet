/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx6;

import java.util.Scanner;/**
 *
 * @author Srinithi
 */
public class queue {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        MyQueue q=new MyQueue();
        char c;
        do
        {
            System.out.println("Select an option :");
            System.out.println("1 --> EnQueue");
            System.out.println("2 --> DeQueue");
            System.out.println("3 --> Display Queue");
            System.out.print("Option : ");
            int i=obj.nextInt();
            switch (i)
            {
                case 1: q.enqueue();
                break;
                case 2: q.dequeue();
                break;
                case 3: q.display();
                break;
                default: System.out.println("Option entered is INAPPROPRIATE");
            } 
            System.out.println("If you want to continue press 'Y'");
            c=obj.next().charAt(0);
        } while (c=='Y' || c=='y');
        if (c!='Y' || c!='y')
        {
            System.out.println("==========Program Terminated==========");
        }
    }
}
interface QueueOperations
{
   void enqueue();
   void dequeue();
   void display();
}
class MyQueue implements QueueOperations
{
    int queue[],n;
    int front=-1,rear=-1;
    Scanner obj=new Scanner(System.in);
    MyQueue()
    {
      System.out.println("Enter the Size of the Queue :");
      n=obj.nextInt();
      queue=new int[n];
    }
    public void enqueue()
    {
        if (rear==n)
        {
            System.out.println("Queue is FULL!!! Cannot Insert!!!");
        }
        else
        {
          System.out.println("Enter the value to be inserted in the Queue :");
          int x=obj.nextInt();
          if (front==-1 && rear==-1)
          {
              front=0;
              rear=0;
          }
          queue[rear]=x;
          rear=rear+1;
        }
    }
    public void dequeue()
    {
        if (front==-1 && rear==-1)
        {
            System.out.println("Queue is EMPTY!!! Nothing can be Deleted!!!");
        }
        else 
        {
            System.out.println("Deleted Element is : "+queue[front]);
            for (int i=0;i<rear;i++)
            {
              queue[i]=queue[i+1]; 
            }
            rear--;
            if (front==rear)
            {
                front=-1;
                rear=-1;
            }
        }
    }
    public void display()
    {
        System.out.println("The elements of the Queue are :");
        for (int i:queue)
        {
            System.out.println(i);
        }
    }
}
