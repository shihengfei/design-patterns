package com.camelot.designpatterns.appearance;

/**
 * 外观模式服务
 */
public class GoodsService {

    private OrderService orderService = new OrderService();
    private PayService payService = new PayService();
    private DeliveryService deliveryService = new DeliveryService();

    public void takeOrder(Goods goods) {
        if (orderService.placeAnOrder(goods)) {
            if (payService.pay(goods)) {
                deliveryService.delivery(goods);
            }
        }
    }
}
