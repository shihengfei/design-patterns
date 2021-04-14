package com.camelot.designpatterns.adapter;

public class Main {
    public static void main(String[] args) {
//        Adapter adapter = new Adapter();
//        adapter.method();
//        adapter.method2();

        ClassAdapter classAdapter = new ClassAdapter(new Adaptee());
        classAdapter.method();
        classAdapter.method2();
    }
}
