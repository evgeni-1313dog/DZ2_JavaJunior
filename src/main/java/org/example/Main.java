package org.example;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Dog dog1 = new Dog("dog1", 5, "");
        Dog dog2 = new Dog("dog2", 10, "Старая");
        Cat cat1 = new Cat("cat1", 48, "мур-мур");
        Cat cat2 = new Cat("cat2", 12, "мял");
        Animal[] animals = new Animal[]{dog1, dog2, cat1, cat2};

        for (Animal animal : animals) {
            Field[] fields = animal.getClass().getDeclaredFields();
            Field[] fieldsFromSuperClass = animal.getClass().getSuperclass().getDeclaredFields();
            System.out.println("---");
            for (Field field : fields) {
                System.out.println(field.getName() + " " + field.get(animal));
            }
            for (Field fromSuperClass : fieldsFromSuperClass) {
                System.out.println(fromSuperClass.getName() + " " + fromSuperClass.get(animal));
            }
            try {
                Method method = animal.getClass().getMethod("makeSound");
                method.invoke(animal);
            } catch (NoSuchMethodException e) {
                System.out.println("Метод не найден");
            }
        }

       }
}