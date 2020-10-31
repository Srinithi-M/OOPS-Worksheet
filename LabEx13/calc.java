/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEx13;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Srinithi
 */
public class calc extends JFrame implements ActionListener {

    JTextField t;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, c, pow2, plus, min, mul, div, exp, log, rec, eq, addSub, dot, sq, sin, cos, tan;
    Container cont;
    JPanel tp, bp;
    double temp, temp1, r, a;
    static double m1, m2;
    double k = 1, x = 0, y = 0, z = 0;
    char ch;

    calc() {
        cont = getContentPane();
        cont.setLayout(new BorderLayout());
        JPanel textpanel = new JPanel();
        t = new JTextField(25);
        t.setHorizontalAlignment(SwingConstants.RIGHT);
        t.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent keyevent) {
                char c = keyevent.getKeyChar();
                if (c >= '0' && c <= '9') {
                } else {
                    keyevent.consume();
                }
            }
        });
        textpanel.add(t);
        bp = new JPanel();
        bp.setLayout(new GridLayout(8, 4, 2, 2));
        boolean t = true;
        b1 = new JButton("1");
        bp.add(b1);
        b1.addActionListener(this);
        b2 = new JButton("2");
        bp.add(b2);
        b2.addActionListener(this);
        b3 = new JButton("3");
        bp.add(b3);
        b3.addActionListener(this);
        b4 = new JButton("4");
        bp.add(b4);
        b4.addActionListener(this);
        b5 = new JButton("5");
        bp.add(b5);
        b5.addActionListener(this);
        b6 = new JButton("6");
        bp.add(b6);
        b6.addActionListener(this);
        b7 = new JButton("7");
        bp.add(b7);
        b7.addActionListener(this);
        b8 = new JButton("8");
        bp.add(b8);
        b8.addActionListener(this);
        b9 = new JButton("9");
        bp.add(b9);
        b9.addActionListener(this);
        b0 = new JButton("0");
        bp.add(b0);
        b0.addActionListener(this);
        plus = new JButton("+");
        bp.add(plus);
        plus.addActionListener(this);

        min = new JButton("-");
        bp.add(min);
        min.addActionListener(this);

        mul = new JButton("*");
        bp.add(mul);
        mul.addActionListener(this);

        div = new JButton("/");
        div.addActionListener(this);
        bp.add(div);

        addSub = new JButton("+/-");
        bp.add(addSub);
        addSub.addActionListener(this);

        dot = new JButton(".");
        bp.add(dot);
        dot.addActionListener(this);

        eq = new JButton("=");
        bp.add(eq);
        eq.addActionListener(this);

        rec = new JButton("1/x");
        bp.add(rec);
        rec.addActionListener(this);
        sq = new JButton("Sqrt");
        bp.add(sq);
        sq.addActionListener(this);
        log = new JButton("log");
        bp.add(log);
        log.addActionListener(this);

        sin = new JButton("SIN");
        bp.add(sin);
        sin.addActionListener(this);
        cos = new JButton("COS");
        bp.add(cos);
        cos.addActionListener(this);
        tan = new JButton("TAN");
        bp.add(tan);
        tan.addActionListener(this);
        pow2 = new JButton("x^2");
        bp.add(pow2);
        pow2.addActionListener(this);

        exp = new JButton("Exp");
        exp.addActionListener(this);
        bp.add(exp);

        c = new JButton("AC");
        bp.add(c);
        c.addActionListener(this);
        cont.add("Center", bp);
        cont.add("North", textpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("1")) {
            if (z == 0) {
                t.setText(t.getText() + "1");
            } else {
                t.setText("");
                t.setText(t.getText() + "1");
                z = 0;
            }
        }
        if (s.equals("2")) {
            if (z == 0) {
                t.setText(t.getText() + "2");
            } else {
                t.setText("");
                t.setText(t.getText() + "2");
                z = 0;
            }
        }
        if (s.equals("3")) {
            if (z == 0) {
                t.setText(t.getText() + "3");
            } else {
                t.setText("");
                t.setText(t.getText() + "3");
                z = 0;
            }
        }
        if (s.equals("4")) {
            if (z == 0) {
                t.setText(t.getText() + "4");
            } else {
                t.setText("");
                t.setText(t.getText() + "4");
                z = 0;
            }
        }
        if (s.equals("5")) {
            if (z == 0) {
                t.setText(t.getText() + "5");
            } else {
                t.setText("");
                t.setText(t.getText() + "5");
                z = 0;
            }
        }
        if (s.equals("6")) {
            if (z == 0) {
                t.setText(t.getText() + "6");
            } else {
                t.setText("");
                t.setText(t.getText() + "6");
                z = 0;
            }
        }
        if (s.equals("7")) {
            if (z == 0) {
                t.setText(t.getText() + "7");
            } else {
                t.setText("");
                t.setText(t.getText() + "7");
                z = 0;
            }
        }
        if (s.equals("8")) {
            if (z == 0) {
                t.setText(t.getText() + "8");
            } else {
                t.setText("");
                t.setText(t.getText() + "8");
                z = 0;
            }
        }
        if (s.equals("9")) {
            if (z == 0) {
                t.setText(t.getText() + "9");
            } else {
                t.setText("");
                t.setText(t.getText() + "9");
                z = 0;
            }
        }
        if (s.equals("0")) {
            if (z == 0) {
                t.setText(t.getText() + "0");
            } else {
                t.setText("");
                t.setText(t.getText() + "0");
                z = 0;
            }
        }
        if (s.equals("AC")) {
            t.setText("");
            x = 0;
            y = 0;
            z = 0;
        }
        if (s.equals("log")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                a = Math.log(Double.parseDouble(t.getText()));
                t.setText("");
                t.setText(t.getText() + a);
            }
        }
        if (s.equals("1/x")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                a = 1 / Double.parseDouble(t.getText());
                t.setText("");
                t.setText(t.getText() + a);
            }
        }
        if (s.equals("Exp")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                a = Math.exp(Double.parseDouble(t.getText()));
                t.setText("");
                t.setText(t.getText() + a);
            }
        }
        if (s.equals("x^2")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                a = Math.pow(Double.parseDouble(t.getText()), 2);
                t.setText("");
                t.setText(t.getText() + a);
            }
        }

        if (s.equals("+/-")) {
            if (x == 0) {
                t.setText("-" + t.getText());
                x = 1;
            } else {
                t.setText(t.getText());
            }
        }
        if (s.equals(".")) {
            if (y == 0) {
                t.setText(t.getText() + ".");
                y = 1;
            } else {
                t.setText(t.getText());
            }
        }
        if (s.equals("+")) {
            if (t.getText().equals("")) {
                t.setText("");
                temp = 0;
                ch = '+';
            } else {
                temp = Double.parseDouble(t.getText());
                t.setText("");
                ch = '+';
                y = 0;
                x = 0;
            }
            t.requestFocus();
        }
        if (s.equals("-")) {
            if (t.getText().equals("")) {
                t.setText("");
                temp = 0;
                ch = '-';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(t.getText());
                t.setText("");
                ch = '-';
            }
            t.requestFocus();
        }
        if (s.equals("/")) {
            if (t.getText().equals("")) {
                t.setText("");
                temp = 1;
                ch = '/';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(t.getText());
                ch = '/';
                t.setText("");
            }
            t.requestFocus();
        }
        if (s.equals("*")) {
            if (t.getText().equals("")) {
                t.setText("");
                temp = 1;
                ch = '*';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(t.getText());
                ch = '*';
                t.setText("");
            }
            t.requestFocus();
        }

        if (s.equals("Sqrt")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                a = Math.sqrt(Double.parseDouble(t.getText()));
                t.setText("");
                t.setText(t.getText() + a);
            }
        }
        if (s.equals("SIN")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                a = Math.sin(Double.parseDouble(t.getText()));
                t.setText("");
                t.setText(t.getText() + a);
            }
        }
        if (s.equals("COS")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                a = Math.cos(Double.parseDouble(t.getText()));
                t.setText("");
                t.setText(t.getText() + a);
            }
        }
        if (s.equals("TAN")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                a = Math.tan(Double.parseDouble(t.getText()));
                t.setText("");
                t.setText(t.getText() + a);
            }
        }
        if (s.equals("=")) {
            if (t.getText().equals("")) {
                t.setText("");
            } else {
                temp1 = Double.parseDouble(t.getText());
                switch (ch) {
                    case '+':
                        r = temp + temp1;
                        break;
                    case '-':
                        r = temp - temp1;
                        break;
                    case '/':
                        r = temp / temp1;
                        break;
                    case '*':
                        r = temp * temp1;
                        break;
                }
                t.setText("");
                t.setText(t.getText() + r);
                z = 1;
            }
        }
    }

    public static void main(String[] args) {
        calc c = new calc();
        c.setTitle("CALCULATOR");
        c.pack();
        c.setVisible(true);
    }

    public void action(ActionEvent e) {
        throw new UnsupportedOperationException("Not Supported !!!");
    }
}
