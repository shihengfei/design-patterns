package com.camelot.designpatterns.appearance;

/**
 * 支付服务
 */
public class PayService {

    public boolean pay(Goods goods) {
        System.out.println("商品" + goods.getName() + "支付成功");
        return true;
    }
}
