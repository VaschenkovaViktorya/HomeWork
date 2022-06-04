package com.example.homework.person;

import java.util.HashMap;
import java.util.Map;

public class PersonDB {
    private static Map<String, Person> persons = new HashMap<>();

    public static Map<String, Person> getAll() {
        ;
        persons.put("0", new Person("Bob", "Marley", "36"));
        persons.put("1", new Person("Angelina", "Jolie", "42"));
        persons.put("2", new Person("Bred", "Pitt", "58"));
        persons.put("3", new Person("Tom", "Cruise", "59"));
        return persons;
    }


}
