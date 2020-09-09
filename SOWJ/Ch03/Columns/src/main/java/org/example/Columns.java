package org.example;

import javax.swing.*;

/**
 *  %[flags][width][.precision]conversion
 */

public class Columns {
    public static void main(String[] args) {
        double num1 = 127.899;
        double num2 = 3456.148;
        double num3 = 3.776;
        double num4 = 264.821;
        double num5 = 88.081;
        double num6 = 1799.99;

        System.out.printf("%8.2f\n", num1);
        System.out.printf("%8.2f\n", num2);
        System.out.printf("%8.2f\n", num3);
        System.out.printf("%8.2f\n", num4);
        System.out.printf("%8.2f\n", num5);
        System.out.printf("%8.2f\n", num6);

        double monthlyPay = 5000.0;
        double annualPay = monthlyPay * 12;
        System.out.printf("Your annual pay is $%,.2f\n", annualPay);

        double number = 1243.4;
        System.out.printf("The number is: %08.1f\n", number);

        int num11 = 123;
        int num12 = 12;
        int num13 = 45678;
        int num14 = 456;
        int num15 = 1234567;
        int num16 = 1234;
        System.out.printf("%-8d%-8d\n", num11, num12);
        System.out.printf("%-8d%-8d\n", num13, num14);
        System.out.printf("%-8d%-8d\n", num15, num16);

        String name1 = "George";
        String name2 = "Franklin";
        String name3 = "Jay";
        String name4 = "Ozzy";
        String name5 = "Carmine";
        String name6 = "Dee";
        System.out.printf("%10s%10s\n", name1, name2);
        System.out.printf("%10s%10s\n", name3, name4);
        System.out.printf("%10s%10s\n", name5, name6);

        System.out.printf("%-10s%-10s\n", name1, name2);
        System.out.printf("%-10s%-10s\n", name3, name4);
        System.out.printf("%-10s%-10s\n", name5, name6);

        String output = String.format("Your annual pay is $%,.2f\n", annualPay);
        JOptionPane.showMessageDialog(null, output);
    }
}
