package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Display {
    JFrame frame;
    JPanel panel;

    JTextPane question;
    JLabel points;

    List<JButton> buttons;

    public Display() {
        frame = new JFrame();
        panel = new JPanel();
        points = new JLabel();

        points.setText("points: ");

        this.question = new JTextPane();
        this.question.setEditable(false);

        frame.add(panel);

        buttons = new ArrayList<>();

        buttons.add(new JButton());
        buttons.add(new JButton());
        buttons.add(new JButton());

        Collections.shuffle(buttons);

        panel.add(this.question);
        panel.add(buttons.get(0));
        panel.add(buttons.get(1));
        panel.add(buttons.get(2));
        panel.add(points);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        this.buttons.get(0).addActionListener(e -> {
            
        });

        this.buttons.get(1).addActionListener(e -> {
            //fel svar
        });

        this.buttons.get(2).addActionListener(e -> {
            //fel svar
        });
    }

    public void setQuestion(PhilipQ quest){
        question.setText(quest.getQuestionAndAnswers().getQuestion());
        buttons.get(0).setText(quest.getQuestionAndAnswers().getAnswer1());
        buttons.get(1).setText(quest.getQuestionAndAnswers().getAnswer2());
        buttons.get(2).setText(quest.getQuestionAndAnswers().getAnswer3());
    }
}
