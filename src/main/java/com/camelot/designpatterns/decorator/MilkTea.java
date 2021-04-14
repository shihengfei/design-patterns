package com.camelot.designpatterns.decorator;

/**
 * 无添加奶茶
 */
public class MilkTea extends AbstractMilkTea{
    @Override
    public String remark() {
        return "没钱只能喝无添加\n";
    }

    @Override
    public int price() {
        return 6;
    }
}
