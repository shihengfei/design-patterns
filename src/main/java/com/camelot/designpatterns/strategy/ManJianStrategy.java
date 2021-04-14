package com.camelot.designpatterns.strategy;

public class ManJianStrategy implements PromotionStrategy{
    @Override
    public void promotion() {
        System.out.println("满1000减99");
    }
}
