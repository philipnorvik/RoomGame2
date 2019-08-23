package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Display {
    JFrame frame;
    JPanel panel;

    JTextPane question;

    List<JButton> buttons;

    public Display(String question, String answer1, String answer2, String answer3) {
        frame = new JFrame();
        panel = new JPanel();

        this.question = new JTextPane();
        this.question.setEditable(false);
        this.question.setText(question);

        frame.add(panel);

        buttons = new ArrayList<>();

        buttons.add(new JButton(answer1));
        buttons.add(new JButton(answer2));
        buttons.add(new JButton(answer3));

        Collections.shuffle(buttons);

        panel.add(this.question);
        panel.add(buttons.get(0));
        panel.add(buttons.get(1));
        panel.add(buttons.get(2));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        this.buttons.get(0).addActionListener(e -> {
            //rätt svar
        });

        this.buttons.get(1).addActionListener(e -> {
            //fel svar
        });

        this.buttons.get(2).addActionListener(e -> {
            //fel svar
        });
    }
}
