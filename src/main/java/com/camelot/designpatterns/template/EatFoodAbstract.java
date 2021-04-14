package com.camelot.designpatterns.template;

/**
 * 模板方法 抽象
 */
public abstract class EatFoodAbstract {

    /***
     * 买菜,多种情况
     */
    protected abstract void maiCai();

    /**
     * 做饭
     */
    final void zuoFan(){
        System.out.println("炒菜中...");
    }

    /**
     * 吃饭
     */
    final void eat(){
        System.out.println("吃饭中...");
    }

    /**
     * 洗锅
     */
    final void xiGuo(){
        System.out.println("洗锅去...");
    }

    /**
     * 流程
     */
    final void flow(){
        this.maiCai();
        this.zuoFan();
        this.eat();
        this.xiGuo();
    }
}
