package com.camelot.designpatterns.appearance;

public class Main {
    public static void main(String[] args) {
        Goods goods = new Goods();
        goods.setName("mac笔记本");
        GoodsService goodsService = new GoodsService();
        goodsService.takeOrder(goods);
    }
}
