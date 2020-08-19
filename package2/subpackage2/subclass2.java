/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2.subpackage2;
import package1.subpackage1.subclass1;
import package1.class1;
import package2.class2;

/**
 *
 * @author Srinithi
 */
public class subclass2 {
    public void exhibit()
    {
        System.out.print("Sub-Package 2 --> 'Hello World !!!'");
    }
    public static void main(String[] args) {
        class1 obj1=new class1();
        subclass1 obj=new subclass1();
        obj1.display();
        obj.show();
        class2 obj2=new class2();
        subclass2 obj3=new subclass2();
        obj2.present();
        obj3.exhibit();
    }
    
}
