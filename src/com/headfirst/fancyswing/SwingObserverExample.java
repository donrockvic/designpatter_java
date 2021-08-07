package com.headfirst.fancyswing;

import javax.swing.*;
import java.awt.*;
/*
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
*/

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Should I do it");
        button.addActionListener(actionEvent -> System.out.println("Don't do it, you might regret it"));
        button.addActionListener(actionEvent -> System.out.println("Come on ! do it"));
        button.setPreferredSize(new Dimension(200, 200));

        frame.add(button);
        frame.setVisible(true);
    }

/*
    class AngelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Don't do it, you might regret it");
        }
    }

    class DevilListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Come on, do it");
        }
    }
*/

}
