package com.sgcc.uvmp.singleton;

public class SingleMode3 {

//    private static SingleMode3 singleMode3;

    private SingleMode3() {
        System.out.println("初始化");
    };

    //静态内部类
    private static class SingletonClass {
        //私有静态常量实例
        private static final SingleMode3 instance = new SingleMode3();
    }

    public static SingleMode3 getInstance() {
        //调用内部类的静态字段，此时内部类初始化
        return SingletonClass.instance;
    }

}
