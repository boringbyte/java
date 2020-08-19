package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        double value1 = 100.0d;
        double value2 = 0.0d;
        double result = 0.0d;
        char opCode = 'd';

        // see there are no {} in if else clause if there is only one statement after if
        if (opCode == 'a')
            result = value1 + value2;
        else if (opCode == 's')
            result = value1 - value2;
        else if (opCode == 'm')
            result = value1 * value2;
        else if (opCode == 'd') {
            if (value2 != 0)
                result = value1 / value2;
        }
        else {
            System.out.println("Invalid opCode: " + opCode);
            result = 0.0d;
        }
        System.out.println(result);

        // &, |, ^, ! are standard logical operators
        // &&, || are conditional logical operators, only first value is evaluated in certain cases
        // blocking statement --> one where are group of statements are enclosed in a {}
        int v1 = 10, v2 = 4;
        final int diff;
        if (v1 > v2) {
            diff = v1 - v2;
            System.out.println("v1 is bigger than v2");
        } else {
            diff = v2 - v1;
            System.out.println("v1 is not bigger than v1");
        }

        // switch can only be used with byte, short, int, long and char data types
        // A match can have multiple statements and each match with break. Otherwise will "fall through" to next match
        switch (opCode) {
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
                result = value2 != 0 ? value1 / value2 : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        System.out.println(result);

    }
}
