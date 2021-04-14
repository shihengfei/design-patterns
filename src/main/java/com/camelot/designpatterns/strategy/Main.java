package com.camelot.designpatterns.strategy;

public class Main {
    public static void main(String[] args) {
        String promotionKey = "fr";
        PromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(promotionKey);
        promotionStrategy.promotion();
    }
}
