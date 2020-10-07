/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx10;

import java.io.FileReader;
import java.io.FileWriter;/**
 *
 * @author Srinithi
 */
public class charstream {
    public static void main(String[] args) throws Exception {
        FileReader fi=new FileReader("flower.jpg");
        FileWriter fo=new FileWriter("flower_charstream_output.jpg");
        int i;
        char ch;
        while ((i=fi.read())!=-1)
        {
            ch=(char)i;
            fo.write(ch);
        }
        fi.close();
        fo.close();
    }
}
