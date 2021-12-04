package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Saraselis");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FAILAS");
        JMenu m2 = new JMenu("MOKINIAI");
        JMenu m3 = new JMenu("MOKYKLOS");


        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);

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
