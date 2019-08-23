package com.company;


import com.company.PhilipQ;

public class Main {

    public static void main(String[] args) {
        Display display = new Display();
        PhilipQ pQuestion = new PhilipQ();
        StevieQ sQuestion = new StevieQ();
        Game game = new Game(display, pQuestion, sQuestion);
    }
}
