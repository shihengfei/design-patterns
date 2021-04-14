package com.camelot.designpatterns.factory.abstractpattern;

public class CatTypeAnimalType extends AbstractAnimalType {
    @Override
    public void type() {
        System.out.println("加菲猫");
    }
}
