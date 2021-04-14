package com.camelot.designpatterns.factory.simple;

/**
 * 创建动物工厂
 */
public class AnimalFactory {

    public AbstractAnimal build(String animalName){
        switch (animalName){
            case "cat": return new Cat();
            case "dog": return new Dog();
        }
        return null;
    }
}
