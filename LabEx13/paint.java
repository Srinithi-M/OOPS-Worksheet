/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx13;

import java.applet.Applet;
import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Srinithi
 */
class brush extends Frame {

    String mg = " ";
    CheckboxMenuItem red, blue, green, pink, orange;

    brush(String title) {
        super(title);
        MenuBar mbar = new MenuBar();
        setMenuBar(mbar);
        Menu draw = new Menu("DRAW");
        MenuItem d1, d2, d3, d4, d5, d6, d7;
        draw.add(d1 = new MenuItem("LINE"));
        draw.add(d2 = new MenuItem("CIRCLE"));
        draw.add(d3 = new MenuItem("SQUARE"));
        draw.add(d7 = new MenuItem("RECTANGLE"));
        draw.add(d4 = new MenuItem("-"));
        Menu sub = new Menu("Fill", true);
        MenuItem s1, s2, s3;
        sub.add(s1 = new MenuItem("Circle"));
        sub.add(s2 = new MenuItem("Square"));
        sub.add(s3 = new MenuItem("Rectangle"));
        draw.add(sub);
        draw.add(d5 = new MenuItem("-"));
        draw.add(d6 = new MenuItem("Close"));
        mbar.add(draw);
        Menu col = new Menu("COLOUR");
        col.add(red = new CheckboxMenuItem("red"));
        col.add(blue = new CheckboxMenuItem("Blue"));
        col.add(green = new CheckboxMenuItem("Green"));
        col.add(pink = new CheckboxMenuItem("Pink"));
        col.add(orange = new CheckboxMenuItem("Orange"));
        mbar.add(col);
        MenuHandler handle = new MenuHandler(this);
        d1.addActionListener(handle);
        d2.addActionListener(handle);
        d3.addActionListener(handle);
        d4.addActionListener(handle);
        d7.addActionListener(handle);
        d6.addActionListener(handle);
        s1.addActionListener(handle);
        s2.addActionListener(handle);
        s3.addActionListener(handle);
        red.addItemListener((ItemListener) handle);
        blue.addItemListener(handle);
        green.addItemListener(handle);
        pink.addItemListener(handle);
        orange.addItemListener(handle);
        Myadapter ad = new Myadapter(this);
        addWindowListener((WindowListener) ad);
    }

    public void paint(Graphics g) {
        if (red.getState()) {
            g.setColor(Color.red);
            blue.setState(false);
            green.setState(false);
            pink.setState(false);
            orange.setState(false);
        } else if (blue.getState()) {
            g.setColor(Color.blue);
            red.setState(false);
            green.setState(false);
            pink.setState(false);
            orange.setState(false);
        } else if (green.getState()) {
            g.setColor(Color.green);
            red.setState(false);
            blue.setState(false);
            pink.setState(false);
            orange.setState(false);
        } else if (pink.getState()) {
            g.setColor(Color.pink);
            red.setState(false);
            green.setState(false);
            blue.setState(false);
            orange.setState(false);
        } else if (orange.getState()) {
            g.setColor(Color.orange);
            red.setState(false);
            green.setState(false);
            pink.setState(false);
            blue.setState(false);
        } else {
            red.setState(false);
            blue.setState(false);
            green.setState(false);
            g.setColor(Color.black);
        }
        if (mg == "circle") {
            g.drawOval(150, 150, 200, 200);
        } else if (mg == "line") {
            g.drawLine(0, 0, 200, 200);
        } else if (mg == "square") {
            g.drawRect(100, 100, 200, 200);
        } else if (mg == "rectangle") {
            g.drawRect(100, 200, 200, 100);
        } else if (mg == "fillc") {
            g.fillOval(150, 150, 200, 200);
        } else if (mg == "fills") {
            g.fillRect(100, 100, 200, 200);
        } else if (mg == "fillr") {
            g.fillRect(100, 200, 200, 100);
        }
        if (mg == "close") {
            setVisible(false);
        }
    }
}

class Myadapter extends WindowAdapter {

    brush br;

    public Myadapter(brush bru) {
        this.br = bru;
    }

    public void WindowClosed(WindowEvent we) {
    }
}

class MenuHandler implements ActionListener, ItemListener {

    brush br;

    public MenuHandler(brush bru) {
        this.br = bru;
    }

    public void actionPerformed(ActionEvent ae) {
        String arg = ae.getActionCommand();
        if (arg.equals("LINE")) {
            br.mg = "line";
        } else if (arg.equals("CIRCLE")) {
            br.mg = "circle";
        } else if (arg.equals("SQUARE")) {
            br.mg = "square";
        } else if (arg.equals("RECTANGLE")) {
            br.mg = "rectangle";
        } else if (arg.equals("Circle")) {
            br.mg = "fillc";
        } else if (arg.equals("Square")) {
            br.mg = "fills";
        } else if (arg.equals("Rectangle")) {
            br.mg = "fillr";
        }
        br.repaint();
    }

    public void itemStateChanged(ItemEvent ie) {
    }
}

public class paint extends Applet {

    Frame f;

    public void init() {
        f = new brush("Paint Brush Application");
        f.setSize(300, 400);
        f.setVisible(true);
    }

    public void paint(Graphics g) {
        Font fb = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 25);
        g.setFont(fb);
        g.setColor(Color.GREEN);
        g.drawString("THANK YOU", 5, 40);

    }

    public void start() {
        f.setVisible(true);
    }

    public void stop() {
        f.setVisible(true);
    }
}