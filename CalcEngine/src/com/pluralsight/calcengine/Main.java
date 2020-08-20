package com.pluralsight.calcengine;

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
    }
}
