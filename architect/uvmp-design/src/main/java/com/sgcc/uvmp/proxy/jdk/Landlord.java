package com.sgcc.uvmp.proxy.jdk;

public class Landlord implements ILandlord{


    public void receive(String money) {
        System.out.println("今收到房租：" + money + "元！");
    }
}
