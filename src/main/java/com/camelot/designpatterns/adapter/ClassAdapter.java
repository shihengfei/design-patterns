package com.camelot.designpatterns.adapter;

/**
 * 对象适配器
 */
public class ClassAdapter implements Target{

    private Adaptee adaptee;

    public ClassAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void method() {
        adaptee.method();
    }

    @Override
    public void method2() {
        // 实现适配工作
        System.out.println("对象适配");
    }
}
