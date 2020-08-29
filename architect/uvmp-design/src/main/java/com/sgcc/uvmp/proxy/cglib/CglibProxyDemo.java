package com.sgcc.uvmp.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CglibProxyDemo {

    public static void main(String[] args) {
        //1创建目标对象
        Boss targetBoss=new Boss();
        CglibProxyBoss cglibProxyBoss = new CglibProxyBoss(targetBoss);
        //2创建代理对象
        //2.1创建增强器对象
        Enhancer enhancer = new Enhancer();
        Boss proxyBoss = (Boss) enhancer.create(targetBoss.getClass(), cglibProxyBoss);
        //3.执行代理对象业务
        proxyBoss.talk("星期一");


    }
}
