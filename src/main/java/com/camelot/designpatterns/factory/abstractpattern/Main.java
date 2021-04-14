package com.camelot.designpatterns.factory.abstractpattern;

public class Main {
    public static void main(String[] args) {
        CatAnimalFactory catAnimalFactory = new CatAnimalFactory();
        catAnimalFactory.getColor().color();
        catAnimalFactory.getType().type();
    }
}
