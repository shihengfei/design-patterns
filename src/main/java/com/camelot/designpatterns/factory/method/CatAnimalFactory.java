package com.camelot.designpatterns.factory.method;

import com.camelot.designpatterns.factory.simple.AbstractAnimal;

/**
 * 目标工厂，继承工厂抽象类
 */
public class CatAnimalFactory extends AbstractAnimalFactory {
    @Override
    public AbstractAnimal build() {
        return new Cat();
    }
}
