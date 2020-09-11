package org.example;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        int x, total = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a positive non zero integer value to know it sum : ");
        x = keyboard.nextInt();
        int y = x;
        while (x > 0) {
            total += x;
            x--;
        }
        System.out.printf("Sum of values from 1 to %d is %d", y, total);
    }
}
