package com.camelot.designpatterns.build;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder().name("飞飞").nickName("阿飞").age(11).build();
        System.out.println(user);
    }
}
