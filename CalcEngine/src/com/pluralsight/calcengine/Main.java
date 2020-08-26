package com.pluralsight.calcengine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];
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
        for(int x = 0; x < opCodes.length; x++) {
            switch (opCodes[x]) {
                case 'a':
                    results[x] = leftVals[x] + rightVals[x];
                    break;
                case 's':
                    results[x] = leftVals[x] - rightVals[x];
                    break;
                case 'm':
                    results[x] = leftVals[x] * rightVals[x];
                    break;
                case 'd':
                    results[x] = leftVals[x] != 0 ? leftVals[x] / rightVals[x] : 0.0d;
                    break;
                default:
                    System.out.println("Invalid opCode: " + opCode);
                    result = 0.0d;
                    break;
            }
        }
        for (double currentResult: results) {
            System.out.println(currentResult);
        }

        // While loop
        int i = 10;
        while (i >= 0) {
            System.out.println("Current i value: " + i);
            i--;
        }

        // Do-while loop
        int j = 10;
        do{
            System.out.println("Current j value: " + j);
            j--;
        } while (j >= 0);

        // for loop
        for (int k=10; k>=0; k--) {
            System.out.println("Current k value: " + k);
        }

        // arrays loop
        float[] theVals = new float[3];
        theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[2] = 30.0f;
        float sum = 0.0f;
        for(int index=0; index < theVals.length; index++)
            sum += theVals[index];
        System.out.println(sum);

        // for each loop
        for (float currentVal: theVals) {
            sum += currentVal;
        }
        System.out.println(sum);

        if (args.length == 0) {
            for(int ii=0; ii<opCodes.length; ii++) {
                results[ii] = execute(opCodes[ii], leftVals[ii], rightVals[ii]);
                System.out.println(results[ii]);
            }
            for (double currentResult: results)
                System.out.println(currentResult);
        } else if (args.length == 1 && args[0].equals("interactive"))
            executeInteractively();
        else if (args.length == 3)
            handelCommandLine(args);
        else
            System.out.println("Please provide an operation code and 2 numeric values");

        // String Class
        String hello = "Hello";
        String world = "world!";
        String message = hello + " " + world;
        System.out.println(message);

        String s1 = "I love";
        s1 += " Java";
        String s2 = "I";
        s2 += " love Java";
        if (s1 == s2) {
            System.out.println("Values are same but they have different references");
        }
        if (s1.equals(s2)) {
            System.out.println("Values are same and don't check the references");
        }

        String s3 = s1.intern();
        String s4 = s2.intern();
        if (s3 == s4) {
            System.out.println("intern creates a new string and assigns it to s3 first time but " +
                    "second time if intern is called it will not create new string but just assign s4 reference" +
                    "to reference of s3");
        }

        // explicit conversion
        int iVal = 100;
        String sVal = String.valueOf(iVal);

        // implicit conversion
        int c = 2, d = 3;
        int e = c * d;
        String output = c + " * " + d + " = " + e;
        System.out.println(e);
        System.out.println(output);
    }

    private static void handelCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }

    static double execute(char opCode, double leftVal, double rightVal) {
        double result;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = leftVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        return result;
    }

    static char opCodeFromString(String operationName) {
        char opCode = operationName.charAt(0);
        return opCode;
    }

    static double valueFromWord(String word) {
        String[] numberWords = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        double value = 0d;
        for (int i = 0; i < numberWords.length; i++) {
            if (word.equals(numberWords[i])) {
                value = i;
                break;
            }
        }
        return value;
    }

    static void executeInteractively() {
        System.out.println("Enter an operation and two numbers:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);

    }

    private static void performOperation(String[] parts) {
        char opCode = opCodeFromString(parts[0]);
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
        double result = execute(opCode, leftVal, rightVal);
        displayResult(opCode, rightVal, leftVal, result);
    }

    // String Builder is mutable string buffer
    private static void displayResult(char opCode, double rightVal, double leftVal, double result) {
        char symbol = symbolFromOpCode(opCode);
        StringBuilder builder = new StringBuilder(20);
        builder.append(leftVal);
        builder.append(" ");
        builder.append(symbol);
        builder.append(" ");
        builder.append(rightVal);
        builder.append(" = ");
        builder.append(result);
        String output = builder.toString();
        System.out.println(output);
    }

    private static char symbolFromOpCode(char opCode) {
        char[] opCodes = {'a', 's', 'm', 'd'};
        char[] symbols = {'+', '-', '*', '/'};
        char symbol = ' ';
        for (int i = 0; i < opCodes.length; i++) {
            if (opCode == opCodes[i]) {
                symbol = symbols[i];
                break;
            }
        }
        return symbol;
    }

    // format specifiers
    // % [argument index][flags][width][precision] conversion
    // %04d --> 0004, %-4d --> left justified
    // %,d --> 1,234,567
    // % d --> -456, (space here when compared to negative value)123
    // %+d --> -456, +456
    // %(d --> (456), 456
    // % (d --> same as above but with alignment
    // %s String format
}
