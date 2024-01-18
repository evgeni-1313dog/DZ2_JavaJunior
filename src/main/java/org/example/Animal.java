package org.example;

public class Animal {
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name;
    public int age;

    @Override
    public String toString() {
        return String.format("%s, %d, %s", name, age);
    }
}
