package com.company;

public class Pointcounter {
    private int points;

    public Pointcounter() {
        points = 0;
    }

    public void addPoint() {
        points++;
    }

    public int getPoints() {
        return points;
    }
}
