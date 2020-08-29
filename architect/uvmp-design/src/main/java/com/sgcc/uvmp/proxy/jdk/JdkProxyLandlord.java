package com.sgcc.uvmp.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxyLandlord implements InvocationHandler {


    private Object obj;//这是动态代理的好处，被封装的对象是Object类型，接受任意类型的对象
    public JdkProxyLandlord(Object obj) {
        this.obj = obj;
    }


    public JdkProxyLandlord() {
    }

//    private Landlord landlord;
//    public JdkProxyLandlord(Landlord landlord) {
//        this.landlord = landlord;
//    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //可以做一些逻辑处理
        String money = (String) args[0];
        if(Integer.valueOf(money) > 10000) {
            money = "普迅公司月租金" + money;
        }else if(Integer.valueOf(money) > 1000) {
            money = "福园北区月租金" + money;
        }else {
            money = "小区地库" + money;
        }
        return method.invoke(obj,money);
    }
}
