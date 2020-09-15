package org.example;

public class Dealer {
    private int die1Value;
    private int die2Value;
    public Dealer() {
        this.die1Value = 0;
        this.die2Value = 0;
    }

    public void rollDice() {
        final int SIDES = 6;
        Die die1 = new Die(SIDES);
        Die die2 = new Die(SIDES);

        this.die1Value = die1.getValue();
        this.die2Value = die2.getValue();
    }

    public String getChoOrHan() {
        String result;
        int sum = this.die1Value + this.die2Value;
        if (sum % 2 == 0)
            result = "Cho (even)";
        else
            result = "Han (odd)";
        return result;
    }

    public int getDie1Value() {
        return this.die1Value;
    }

    public int getDie2Value() {
        return this.die2Value;
    }
}
