package com.headfirst.extra;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class HelloWorldSwing {
    public static void createAndShow(){
        JFrame jFrame = new JFrame("Vicky tab");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(500, 360);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello world Label");
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        label.setBorder(border);
        label.setPreferredSize(new Dimension(150, 100));

        label.setText("Vicky here are ur content");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        jFrame.add(label);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShow();
    }
}
