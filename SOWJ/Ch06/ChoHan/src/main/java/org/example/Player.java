package org.example;

import java.util.Random;

public class Player {
    private String name;
    private String guess;
    private int points;

    public Player(String name) {
        this.name = name;
        this.guess = "";
        this.points = 0;
    }

    public void makeGuess() {
        Random rand = new Random();
        int guessNumber = rand.nextInt(2);
        if (guessNumber == 0)
            this.guess = "Cho (even)";
        else
            this.guess = "Han (odd)";
    }

    public void addPoints(int newPoints) {
        this.points += newPoints;
    }

    public String getName() {
        return name;
    }

    public String getGuess() {
        return guess;
    }

    public int getPoints() {
        return points;
    }
}
