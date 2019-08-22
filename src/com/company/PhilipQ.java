package com.company;

import java.util.Scanner;

public class PhilipQ {

    String question;
    String answer;

    public PhilipQ() {
    }

    public PhilipQ(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    String q1 = "Vilken färg är bananer?\n" +

            "a, blå\n b, grön\n c, gul\n";

    String q2 = "Vilken färg är apelsiner?\n" +

            "a, orange\n b, grön\n c, gul\n";

    String q3 = "Vilken färg är äpplen?\n" +

            "a, rund\n b, fyrkantig\n c, Trekantig\n";

    public PhilipQ[] questions = {
            new PhilipQ(q1, "c"),
            new PhilipQ(q2, "a"),
            new PhilipQ(q3, "a")
    };


    public void runQuiz() {
        int score = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].question);
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase(questions[i].answer)) {
                score++;
            }
        }
        System.out.println("din poäng: " + score);

    }
}
