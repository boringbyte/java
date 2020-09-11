package org.example;

import java.util.Scanner;

public class DistanceTravelled {
    public static void main(String[] args) {
        int speed, numberOfHours;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the speed of a vehicle (in miles-per-hour): ");
        speed = keyboard.nextInt();
        System.out.println("Enter the number of hours it has travelled: ");
        numberOfHours = keyboard.nextInt();

        if (speed < 0 || numberOfHours < 0) {
            System.out.println("Invalid input");
        } else {
            System.out.printf("%-10s %s\n", "Hours", "Distance Traveled");
            System.out.println("------------------------------");
            int i = 1;
            while (i <= numberOfHours) {
                System.out.printf("%-20d %d\n", i, i * speed);
                i++;
            }
        }
    }
}
