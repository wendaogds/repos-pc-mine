package com.sgcc.uvmp.singleton;

public class SingleMode2 {

    private static SingleMode2 singleMode2;

    private SingleMode2() {};

    public static SingleMode2 getInstance() {   //这里不上锁   不然太耗性能   每次都判断锁
        if(singleMode2 == null) {
            synchronized (SingleMode2.class) {      //如果并发等待锁    则会不安全，所以仍然需要判断
                if(singleMode2 == null) {
                    singleMode2 = new SingleMode2();
                }
            }
        }
        return singleMode2;
    }
}
