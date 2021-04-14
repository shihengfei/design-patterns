package com.camelot.designpatterns.factory.abstractpattern;

/**
 * 创建动物工厂抽象类
 */
public interface AnimalFactory {

    AbstractAnimalColor getColor();

    AbstractAnimalType getType();
}
