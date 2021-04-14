package com.camelot.designpatterns.strategy;

public class DaZheStrategy implements PromotionStrategy{
    @Override
    public void promotion() {
        System.out.println("打88折");
    }
}
