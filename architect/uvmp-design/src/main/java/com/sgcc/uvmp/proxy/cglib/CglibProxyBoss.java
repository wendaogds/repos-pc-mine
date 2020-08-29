package com.sgcc.uvmp.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyBoss implements MethodInterceptor {

    private Object instance;
    public CglibProxyBoss(Object instance) {
        this.instance = instance;
    }

    /**
     * 代理过程
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        return method.invoke(instance,objects);
    }
}
