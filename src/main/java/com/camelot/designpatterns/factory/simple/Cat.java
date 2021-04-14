package com.camelot.designpatterns.factory.simple;

/**
 * 创建动物继承抽象类
 */
public class Cat extends AbstractAnimal {

    @Override
    public void raise() {
        System.out.println("养猫");
    }
}
