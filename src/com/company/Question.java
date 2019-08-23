package com.company;

public class Question {

    private String question;
    private String answer1, answer2, answer3;
    private String correctAnswer;

    public Question(String question, String answer1, String answer2, String answer3, String correctAnswer){
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion(){
        return question;
    }

    public String getAnswer1(){
        return answer1;
    }

    public String getAnswer2(){
        return answer2;
    }

    public String getAnswer3(){
        return answer3;
    }

    public String getCorrectAnswer(){
        return correctAnswer;
    }
}