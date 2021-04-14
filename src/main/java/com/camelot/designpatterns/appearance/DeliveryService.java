package com.camelot.designpatterns.appearance;

/**
 * 快递服务
 */
public class DeliveryService {

    public void delivery(Goods goods) {
        System.out.println(goods.getName() + "已由顺丰XX接收，订单运输中");
    }
}
