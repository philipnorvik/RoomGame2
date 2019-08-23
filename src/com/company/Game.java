package com.company;

public class Game {

    private Display display;
    private PhilipQ pQuestion;
    private StevieQ sQuestion;
    private boolean gameOver = false;

    public Game(Display display, PhilipQ pQuestion, StevieQ sQuestion){
        this.display = display;
        this.pQuestion = pQuestion;
        this.sQuestion = sQuestion;
    }

    public void runGame(){
        if(display.getIndex() == 2){
            System.out.println("Game over: " + display.pc.getPoints());
            System.exit(0);
        }
        display.setQuestion(pQuestion);
    }
}