package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhilipQ {

    String question= "";
    String answer ="";
    public List<PhilipQ> questions = new ArrayList<>();

    public PhilipQ() {
        questions.add(new PhilipQ(q1, "c"));
        questions.add(new PhilipQ(q2, "a"));
        questions.add(new PhilipQ(q3, "a"));
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

    public void runQuiz() {
        int score = 0;
        Scanner scanner = new Scanner(System. in);

        for (int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i).question);
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(questions.get(i).answer)) {
                score++;
            }
        }
        System.out.println("din poäng: " + score);

    }
}
