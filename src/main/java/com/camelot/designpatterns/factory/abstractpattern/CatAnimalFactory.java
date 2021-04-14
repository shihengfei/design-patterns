package com.camelot.designpatterns.factory.abstractpattern;

/**
 * 实现组合类型工厂
 */
public class CatAnimalFactory implements AnimalFactory{
    @Override
    public AbstractAnimalColor getColor() {
        return new CatColorAnimalColor();
    }

    @Override
    public AbstractAnimalType getType() {
        return new CatTypeAnimalType();
    }
}
