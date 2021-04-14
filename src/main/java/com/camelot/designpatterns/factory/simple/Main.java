package com.camelot.designpatterns.factory.simple;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        AbstractAnimal cat = animalFactory.build("dog");
        cat.raise();
    }
}
