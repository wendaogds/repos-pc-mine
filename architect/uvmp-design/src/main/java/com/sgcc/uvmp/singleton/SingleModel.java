package com.sgcc.uvmp.singleton;

public class SingleModel {

    //饿汉式   直接new 出来    有可能对象一直没有用  浪费了内存
    private static SingleModel singleModel = new SingleModel();

    private SingleModel(){};

    public static SingleModel getInstance() {
        return singleModel;
    }
}
