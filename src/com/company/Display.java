package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Display {
    JFrame frame;
    JPanel panel;

    PhilipQ pk;

    JTextPane question;
    JLabel points;
    int index = 0;
    Pointcounter pc;

    List<JButton> buttons;

    public Display() {
        frame = new JFrame();
        panel = new JPanel();
        points = new JLabel();

        pc = new Pointcounter();

        points.setText("points: 0");

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
            //rätt svar
            pc.addPoint();
            setQuestion(pk);
        });

        this.buttons.get(1).addActionListener(e -> {
            //fel svar
            setQuestion(pk);
        });

        this.buttons.get(2).addActionListener(e -> {
            //fel svar
            setQuestion(pk);
        });
    }

    public void setQuestion(PhilipQ quest){
        if(quest == null || index >= 3) {
            System.out.println("Game over: " + pc.getPoints());
            System.exit(0);
        }
        points.setText("points: " + pc.getPoints());
        pk = quest;
        question.setText(quest.getQuestionAndAnswers(index).getQuestion());
        buttons.get(0).setText(quest.getQuestionAndAnswers(index).getAnswer1());
        buttons.get(1).setText(quest.getQuestionAndAnswers(index).getAnswer2());
        buttons.get(2).setText(quest.getQuestionAndAnswers(index).getAnswer3());

        index++;

        panel.repaint();
        panel.revalidate();
    }

    public int getIndex(){
        return index;
    }
}
