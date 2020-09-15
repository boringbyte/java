package org.example;

import java.util.Random;

public class Die {
    private int sides;
    private int value;

    public Die(int numSides) {
        this.sides = numSides;
        roll();
    }

    public void roll() {
        Random rand = new Random();
        this.value = rand.nextInt(this.sides) + 1;
    }

    public int getSides() {
        return this.sides;
    }

    public int getValue() {
        return this.value;
    }
}
