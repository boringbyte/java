package org.example;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class SalesReport {
    public static void main(String[] args) throws Exception {
        final int NUM_DAYS = 30;
        String filename;
        double totalSales;
        double averageSales;

        filename = getFileName();
        totalSales = getTotalSales(filename);
        averageSales = totalSales / NUM_DAYS;
        displayResults(totalSales, averageSales);
        System.exit(0);
    }

    private static void displayResults(double total, double avg) {
        JOptionPane.showMessageDialog(null,
                String.format("The average sales for the period is $%,.2f\n" +
                              "The average daily sales were $%,.2f", total, avg));
    }

    private static double getTotalSales(String filename) throws Exception {
        double total = 0.0;
        double sales;
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNext()) {
            sales = inputFile.nextDouble();
            total += sales;
        }
        inputFile.close();
        return total;
    }

    private static String getFileName() {
        String file;
        file = JOptionPane.showInputDialog("Enter the name of the file\n" + "containing 30 days of sales amounts.");
        return file;
    }
}
