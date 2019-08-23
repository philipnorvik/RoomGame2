package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhilipQ {

    private String question= "";
    private String answer ="";
    private List<PhilipQ> questions = new ArrayList<>();
    private int index;

    public PhilipQ() {
        String q1 = "Vilken färg är bananer?\n" +
            "a, blå\n b, grön\n c, gul\n";

        String q2 = "Vilken färg är apelsiner?\n" +
            "a, orange\n b, grön\n c, gul\n";

        String q3 = "Vilken färg är äpplen?\n" +
            "a, rund\n b, fyrkantig\n c, Trekantig\n";

        questions.add(new PhilipQ(q1, "c"));
        questions.add(new PhilipQ(q2, "a"));
        questions.add(new PhilipQ(q3, "a"));
        index = 0;
    }

    public PhilipQ(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public PhilipQ getQuestion(){
        if(index < questions.length){
            return questions.get(index++);
		    }
		    return null;
    }
}
