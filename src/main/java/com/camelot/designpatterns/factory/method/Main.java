package com.camelot.designpatterns.factory.method;

import com.camelot.designpatterns.factory.simple.AbstractAnimal;

public class Main {
    public static void main(String[] args) {
        CatAnimalFactory catAnimalFactory = new CatAnimalFactory();
        AbstractAnimal build = catAnimalFactory.build();
        build.raise();
    }
}
