package org.example;

import javax.swing.*;

/**
 * This program demonstrates a nested if statement.
 */

public class LoanQualifier {
    public static void main(String[] args) {
        double salary, yearsOnJob;
        String input;

        input = JOptionPane.showInputDialog("Enter your annual salary.");
        salary = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter the number of years at your current job.");
        yearsOnJob = Double.parseDouble(input);

        if (salary >= 30000) {
            if (yearsOnJob >= 2) {
                JOptionPane.showMessageDialog(null, "You qualify for the loan.");
            } else {
                JOptionPane.showMessageDialog(null, "You must have been on your " +
                        "current job for at least two years to qualify.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "You must earn at least $30,000 per year to qualify");
        }
        System.exit(0);
    }
}
