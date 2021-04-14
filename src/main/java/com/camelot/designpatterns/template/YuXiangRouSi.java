package com.camelot.designpatterns.template;

/**
 * 做鱼香肉丝
 */
public class YuXiangRouSi extends EatFoodAbstract{
    @Override
    protected void maiCai() {
        System.out.println("买肉");
    }
}
