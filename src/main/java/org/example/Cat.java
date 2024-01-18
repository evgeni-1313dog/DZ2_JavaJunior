package org.example;

public class Cat extends Animal{

    public String voice;

    public String getVoice() {
        return voice;
    }

    public Cat(String name, int age, String voice) {
        super(name, age);
        this.voice = voice;
    }

    public void makeSound(){
        System.out.println("Пора спать!");
    }
}
