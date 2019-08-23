package com.company;

import javax.swing.*;

public class Display {
    JFrame frame;
    JPanel panel;

    JTextPane question;
    JButton answer1;
    JButton answer2;
    JButton answer3;

    public Display(String question, String answer1, String answer2, String answer3) {
        frame = new JFrame();
        panel = new JPanel();

        this.question = new JTextPane();
        this.answer1 = new JButton(answer1);
        this.answer2 = new JButton(answer2);
        this.answer3 = new JButton(answer3);
        this.question.setEditable(false);
        this.question.setText(question);

        frame.add(panel);

        panel.add(this.question);
        panel.add(this.answer1);
        panel.add(this.answer2);
        panel.add(this.answer3);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
