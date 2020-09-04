package com.siva.javacourse.lesson2;

import com.siva.javacourse.lesson10.LoggingLevel;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private static final String[] MY_STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"};

    public String[] states() {
        return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length);
    }

    @Test
    public void shouldReturnHelloWorld() {
        Person siva = new Person();
        assertEquals("Hello World", siva.helloWord());
    }

    @Test
    public void shouldReturnHelloSiva() {
        Person person = new Person();
        assertEquals("Hello Siva", person.hello("Siva"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        assertEquals(9, person3.numberOfPersons());  // First object is created in the 1st test case using default constructor
    }

    @Test
    public void shouldReturnNumberOfPersonsInLoop() {
        for (int i=0; i<=4; i++) {
            Person person = new Person();
        }
        assertEquals(6, Person.numberOfPersons());
    }

    @Test
    public void demonstrateBoolean() {
        boolean monday = true;
        boolean raining = true;

        if (monday && raining) {
            System.out.println("Drink Beer");
        }
    }

    @Test
    public void demonstrateArrays() {
        Person[] persons = new Person[4];
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();
        persons[3] = new Person();
        System.out.println(persons.length);

        for (Person person: persons) {
            System.out.println(person.helloWord());
        }
        Person myPerson = new Person();
        Person[] persons2 = {persons[0], null, myPerson, persons[2]};

        for (String state: MY_STATE_VALUES) {
            if (state.equals("PENDING")) {
                System.out.println("PENDING");
            }
            if (state.equals("PROCESSING")) {
                System.out.println("PROCESSING");
            }
            if (state.equals("PROCESSED")) {
                System.out.println("PROCESSED");
            }
        }

//        enums
        LoggingLevel state = LoggingLevel.PENDING;
        System.out.println(state);

        for (LoggingLevel state1: LoggingLevel.values()) {
            if (state1 == LoggingLevel.PENDING) {
                System.out.println("PENDING");
            }
            if (state1 == LoggingLevel.PROCESSING) {
                System.out.println("PROCESSING");
            }
            if (state1 == LoggingLevel.PROCESSED) {
                System.out.println("PROCESSED");
            }
        }
    }
}
