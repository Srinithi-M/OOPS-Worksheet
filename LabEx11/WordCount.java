/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx11;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
/**
 *
 * @author Srinithi
 */
public class WordCount {
    public static void main(String[] args) {
        word obj = new word();
        fileno1 f1 = new fileno1(obj,args[0]);
        fileno2 f2 = new fileno2(obj,args[1]);
        fileno3 f3 = new fileno3(obj,args[2]);
        f1.start();
        f2.start();
        f3.start();
    }
}

class word
{
    public void count(String fn) throws IOException,FileNotFoundException
    {
        int count=0;
        File f=new File(fn);
        BufferedReader br = new BufferedReader(new FileReader(f));
        String str;
        while ((str=br.readLine())!=null)
        {
            String words[]=str.split(" ");
            for (int i=0;i<words.length;i++)
            {
                count=count+1;
            }
        }
        System.out.println("Number of words in the file " + f.getName() + " is : " + count + " words");
        br.close();
    }
}
class fileno1 extends Thread
{
    word w;
    String fn;
    public fileno1(word w,String fn)
    {
        this.w=w;
        this.fn=fn;
    }
    public void run()
    {
        try
        {
            w.count(fn);
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}

class fileno2 extends Thread
{
    word w;
    String fn;
    public fileno2(word w,String fn)
    {
        this.w=w;
        this.fn=fn;
    }
    public void run()
    {
        try
        {
            w.count(fn);
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}

class fileno3 extends Thread
{
    word w;
    String fn;
    public fileno3(word w,String fn)
    {
        this.w=w;
        this.fn=fn;
    }
    public void run()
    {
        try
        {
            w.count(fn);
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}