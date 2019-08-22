package com.company;

public class StevieQ implements RoomsIF {

    @Override
    public String queryOne() {
        return "Vad är den romerska siffran för 100? \n" +
                " M\n" +
                " C\n" +
                " D";
    }

    @Override
    public String answerOne(String answer) {
        if(answer.equalsIgnoreCase("C")){
            return "Rätt svar!";
        }else{
            return "Fel svar!\n"+"Rätt svar är C";
        }
    }

    @Override
    public String queryTwo() {
        return "Vilken artist sjöng \"Härligt härligt, men farligt farligt\"?";
    }

    @Override
    public String answerTwo(String answer) {
        if(answer.equalsIgnoreCase("Björn Skifs")){
            return "Rätt svar!";
        }else{
            return "Fel svar!\n"+"Rätt svar är Björn Skifs";
        }


    }

    @Override
    public String queryThree() {
        return "Vad heter Martin Becks granne som ofta frågar \"ska du ha dig en stänkare\"?";
    }

    @Override
    public String answerThree(String answer) {
        if(answer.equalsIgnoreCase("Valdemar")){
            return "Rätt svar!";
        }else{
            return "Fel svar!\n"+"Rätt svar är Valdemar";
        }
    }
}
