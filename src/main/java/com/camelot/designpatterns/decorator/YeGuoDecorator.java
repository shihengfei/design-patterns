package com.camelot.designpatterns.decorator;

/**
 * 红豆奶茶装饰器
 */
public class YeGuoDecorator extends AbstractDecorator{

    public YeGuoDecorator(AbstractMilkTea abstractMilkTea) {
        super(abstractMilkTea);
    }

    @Override
    public String remark() {
        return super.remark()+"加椰果...\n";
    }

    @Override
    public int price() {
        return super.price() + 3;
    }
}
