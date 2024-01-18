package org.example;

public class Dog extends Animal{

    public String evil;
    public Dog(String name, int age, String evil) {
        super(name, age);
        this.evil = evil;
    }

    public void makeSound(){
        System.out.println("Пора гулят!");
    }
}
