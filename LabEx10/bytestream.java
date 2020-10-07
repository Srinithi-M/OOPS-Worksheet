/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;/**
 *
 * @author Srinithi
 */
public class bytestream {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        FileInputStream fi=new FileInputStream("flower.jpg");
        FileOutputStream fo=new FileOutputStream("flower_bytestream_output.jpg");
        int i=0;
        while ((i=fi.read())!=-1)
        {
            fo.write(i);
        }
        System.out.println("Success !!!");
        fi.close();
        fo.close();
    }
}
