package com.sgcc.uvmp.proxy.jdk;

import java.lang.reflect.Proxy;

public class JdkProxyDemo {

    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        JdkProxyLandlord jdkProxyLandlord = new JdkProxyLandlord(landlord);
//        JdkProxyLandlord jdkProxyLandlord = new JdkProxyLandlord();
        ILandlord proxyInstance = (ILandlord) Proxy.newProxyInstance(landlord.getClass().getClassLoader(), landlord.getClass().getInterfaces(), jdkProxyLandlord);
        proxyInstance.receive("500");
        proxyInstance.receive("1200");
        proxyInstance.receive("18000");
    }
}
