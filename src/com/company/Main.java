package com.company;

import com.company.mokiniai.MokiniaiIMPL;
import org.omg.CORBA.DynAnyPackage.Invalid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {


        MokiniaiIMPL mok1 = new MokiniaiIMPL("Jonas","Jonaitis",382451912,6,"Saules Gimnazija");
        MokiniaiIMPL mok2 = new MokiniaiIMPL("Petras","Petraitis",382451952,6,"Saules Gimnazija");

        LinkedList<MokiniaiIMPL> linkedList = new LinkedList<>();
        linkedList.add(mok1);
        linkedList.add(mok2);

        JFrame frame = new JFrame("Saraselis");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FAILAS");
        JButton m2 = new JButton("MOKINIAI");
        JMenu m3 = new JMenu("MOKYKLOS");


        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
//         Kol kas nereikia
//        JMenuItem m11 = new JMenuItem("Open");
//        JMenuItem m22 = new JMenuItem("Save as");
//        m1.add(m11);
//        m1.add(m22);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Paieska");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("ieskoti");


        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);

        // Text Area at the Center
        JTextArea ta = new JTextArea();
        ta.setEditable(false);

        m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    for (MokiniaiIMPL mok: linkedList) {
                        ta.setText(ta.getText() + "\n" + mok.getVardas() );

                }
            }
        });

        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ta.getText().isEmpty()) {
                    ta.setText(tf.getText());
                } else {
                    ta.setText(ta.getText() + "\n" + tf.getText());
                }
            }
        });

        //Adding Components to the frame.

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}
