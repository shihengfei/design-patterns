package com.camelot.designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        YeGuoDecorator yeGuoDecorator = new YeGuoDecorator(new HongDouDecorator(new MilkTea()));
        System.out.println(yeGuoDecorator.remark() + "价格是：" + yeGuoDecorator.price());
    }
}
