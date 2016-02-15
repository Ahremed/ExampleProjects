package example.Calculator;
import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Vladyslav on 04.02.2016.
 */
public class Frame extends JFrame {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b11,b12,b14,b10,b13,b15,b16,b17;
    JTextField t1;
    JLabel l1;
    static double res,num;
    eHadler Hand = new eHadler();
    int point;


    public Frame(String s){
        super(s);
        setLayout(new FlowLayout());
        b1= new JButton("1");
        b2= new JButton("2");
        b3= new JButton("3");
        b4= new JButton("4");
        b5= new JButton("5");
        b6= new JButton("6");
        b7= new JButton("7");
        b8= new JButton("8");
        b9= new JButton("9");
        b0= new JButton("0");
        b10= new JButton("       ,         ");
        b11= new JButton("+");
        b12= new JButton("-");
        b13= new JButton("*");
        b14= new JButton("/");
        b15= new JButton("C");
        b16= new JButton("=");
        t1 = new JTextField(13);
        l1 =  new JLabel("                ");
        add(l1);
        add(t1);
        add(b7);
        add(b8);
        add(b9);
        add(b4);
        add(b5);
        add(b6);
        add(b1);
        add(b2);
        add(b3);
        add(b0);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);
        add(b16);
        b0.addActionListener(Hand);
        b1.addActionListener(Hand);
        b2.addActionListener(Hand);
        b3.addActionListener(Hand);
        b4.addActionListener(Hand);
        b5.addActionListener(Hand);
        b6.addActionListener(Hand);
        b7.addActionListener(Hand);
        b8.addActionListener(Hand);
        b9.addActionListener(Hand);
        b10.addActionListener(Hand);
        b11.addActionListener(Hand);
        b12.addActionListener(Hand);
        b13.addActionListener(Hand);
        b14.addActionListener(Hand);
        b15.addActionListener(Hand);

    }

   public class eHadler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
              if (e.getSource()==b0)
             {
               num=num*10;
               t1.setText(String.valueOf(num));
             }
                if (e.getSource()==b1)
                {
                    if (point==0)
                    {
                        num=num*10+1;
                        t1.setText(String.valueOf(num));
                    }
                    else
                    {
                       num=num+1/Math.pow(10,point);
                        point++;
                        t1.setText(String.valueOf(num));
                    }
                }
                if (e.getSource()==b2)
                {
                    num=num*10+2;
                    t1.setText(String.valueOf(num));
                }
                if (e.getSource()==b3)
                {
                    num=num*10+3;
                    t1.setText(String.valueOf(num));
                }
                if (e.getSource()==b4)
                {
                    num=num*10+4;
                    t1.setText(String.valueOf(num));
                }
                if (e.getSource()==b5)
                {
                    num=num*10+5;
                    t1.setText(String.valueOf(num));
                }
                if (e.getSource()==b6)
                {
                    num=num*10+6;
                    t1.setText(String.valueOf(num));
                }
                if (e.getSource()==b7)
                {
                    num=num*10+7;
                    t1.setText(String.valueOf(num));
                }
                if (e.getSource()==b8)
                {
                    num=num*10+8;
                    t1.setText(String.valueOf(num));
                }
                if (e.getSource()==b9)
                {
                    num=num*10+9;
                    t1.setText(String.valueOf(num));
                }
                if (e.getSource()==b10)
                {
                 if (point==0) point++;
                }
                if (e.getSource()==b11)
                {
                    res+=num;
                    num=0;
                    l1.setText("Result = " + res);
                    t1.setText("");
                    point=0;
                }
                if (e.getSource()==b12)
                {
                    res-=num;
                    num=0;
                    l1.setText("Result = " + res);
                    t1.setText("");
                    point=0;
                }
                if (e.getSource()==b13)
                {
                    res=res*num;
                    num=0;
                    l1.setText("Result = " + res);
                    t1.setText("");
                    point=0;
                }
                if (e.getSource()==b14)
                {
                    res=res/num;
                    num=0;
                    l1.setText("Result = " + res);
                    t1.setText("");
                    point=0;
                }

            }
            catch (Exception ex)
            {

            }
        }
    }

}
