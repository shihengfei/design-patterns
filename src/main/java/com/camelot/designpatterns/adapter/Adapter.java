package com.camelot.designpatterns.adapter;

/**
 * 适配器
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void method2() {
        System.out.println("适配目标方法2");
    }
}
