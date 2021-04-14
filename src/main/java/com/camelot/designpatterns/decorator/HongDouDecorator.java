package com.camelot.designpatterns.decorator;

/**
 * 红豆奶茶装饰器
 */
public class HongDouDecorator extends AbstractDecorator{

    public HongDouDecorator(AbstractMilkTea abstractMilkTea) {
        super(abstractMilkTea);
    }

    @Override
    public String remark() {
        return super.remark()+"加红豆...\n";
    }

    @Override
    public int price() {
        return super.price() + 3;
    }
}
