package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhilipQ {

    private List<Question> questions = new ArrayList<>();
    private int index;

    public PhilipQ() {
        String q1 = "Vilken färg är bananer?";
        String a1 = "Blå";
        String a2 = "grön";
        String a3 = "gul";

        String q2 = "Vilken färg är apelsiner?";
        String a4 = "Orange";
        String a5 = "Grön";
        String a6 = "Gul";

        String q3 = "Vilken färg är äpplen?";
        String a7 = "Rund";
        String a8 = "Fyrkantig";
        String a9 = "Trekantig";

        questions.add(new Question(q1, a1, a2, a3, a3));
        questions.add(new Question(q2, a4, a5, a6, a4));
        questions.add(new Question(q3, a7, a8, a9, a7));

        index = 0;
    }

    public Question getQuestionAndAnswers(int index) {

        return questions.get(index);

    }
}
