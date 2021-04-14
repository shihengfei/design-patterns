package com.camelot.designpatterns.decorator;

/**
 * 装饰器
 */
public class AbstractDecorator extends AbstractMilkTea{

    private AbstractMilkTea abstractMilkTea;

    public AbstractDecorator(AbstractMilkTea abstractMilkTea) {
        this.abstractMilkTea = abstractMilkTea;
    }

    @Override
    public String remark() {
        return abstractMilkTea.remark();
    }

    @Override
    public int price() {
        return abstractMilkTea.price();
    }
}
