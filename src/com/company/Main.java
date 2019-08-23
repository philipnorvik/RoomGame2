package com.company;

public class Main {

    public static void main(String[] args) {
        Display display = new Display();
        PhilipQ pQuestion = new PhilipQ();
        StevieQ sQuestion = new StevieQ();
        Game game = new Game(display, pQuestion, sQuestion);
        game.runGame();
    }
}
