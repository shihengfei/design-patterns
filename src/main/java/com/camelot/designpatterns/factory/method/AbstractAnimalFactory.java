package com.camelot.designpatterns.factory.method;

import com.camelot.designpatterns.factory.simple.AbstractAnimal;

/**
 * 创建动物工厂抽象类
 */
public abstract class AbstractAnimalFactory {

    /**
     * 抽象构建方法
     * @return
     */
    public abstract AbstractAnimal build();
}
