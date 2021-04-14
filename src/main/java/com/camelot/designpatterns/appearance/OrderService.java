package com.camelot.designpatterns.appearance;

/**
 * 下单服务
 */
public class OrderService {

    public boolean placeAnOrder(Goods goods) {
        System.out.println(goods.getName() + "下单成功");
        return true;
    }
}
