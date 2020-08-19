package com.pluralsight.organized;

public class Main {

    public static void main(String[] args) {
        System.out.println("We got organized!");

        // final keyword is very similar to const keyword in python.
        // final variable can be assigned after declaring

        byte numberOfEnglishLetters = 26;
        short feetInMile = 5280;
        int milesToSun = 92960000;
        long milesInALightYear = 5879000000000L;

        System.out.println(numberOfEnglishLetters);
        System.out.println(feetInMile);
        System.out.println(milesToSun);
        System.out.println(milesInALightYear);

        float kilometersInAMarathon = 42.195f;
        float absoluteZeroInCelsius = -273.15f;
        double atomWidthInMeters = 0.00000000001d;

        System.out.println(kilometersInAMarathon);
        System.out.println(absoluteZeroInCelsius);
        System.out.println(atomWidthInMeters);

        char regularU = 'U'; // single quotes
        char accentedU = '\u00DA';

        System.out.println(regularU);
        System.out.println(accentedU);

        boolean iLoveJava = true;

        System.out.println(iLoveJava);

        // This is only for primitive data types
        int firstValue = 100;
        int otherValue = firstValue; // here otherValue is 100
        firstValue = 50; // here firstValue is 50 and otherValue is 100
        otherValue = 70; // here firstValue is 50 and otherValue is 70.

        // There are ++, -- prefix and postfix operators
        int someValue = 5;
        System.out.println(++someValue);
        System.out.println(someValue);

        int someOtherValue = 5;
        System.out.println(someOtherValue++);
        System.out.println(someOtherValue);

        // There are += -= *= /= %= similar to python
        int myOtherValue = 100;
        int val1 = 5;
        int val2 = 10;
        myOtherValue /= val1 * val2;
        System.out.println(myOtherValue);

        // Type conversion
        int intValueOne = 50;
        long longValueOne = intValueOne; // implicit
        System.out.println(longValueOne);

        long longValueTwo = 50;
        int intValueTwo = (int) longValueTwo; // explicit
        System.out.println(intValueTwo);

        // Conditional Assignment
        // condition ? true-value : false-value
        int value1 = 7;
        int value2 = 5;
        int maxValue = value1 > value2 ? value1 : value2;
        System.out.println(maxValue);

        if (value1 > value2) {
            System.out.println("value 1 is bigger than value2");
        } else if (value1 < value2){
            System.out.println("value 2 is bigger than value1");
        } else {
            System.out.println("value 1 and value 2 are equal");
        }
    }
}
