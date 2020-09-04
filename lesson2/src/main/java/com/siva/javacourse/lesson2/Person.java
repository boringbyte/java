package com.siva.javacourse.lesson2;

import com.siva.javacourse.lesson3.Name;

public class Person {

    private Name personName;
    private static int personCounter;

    public Person() {
        personCounter += 1;
        /*
        empty on purpose - default constructor
        */
    }

    public Person(Name personName) {
        this.personName = personName;
    }

    public String helloWord() {
        return "Hello World";
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}
