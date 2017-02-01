package com.astontech.bo.interfaces;

import java.lang.FunctionalInterface;import java.lang.Object;@FunctionalInterface
public interface IReturn {

    //functional interfaces:    one abstract method, as many instance or static methods as you'd like.
    public abstract String returnPerson(String x);
    //public abstract int returnInt2(String x);


    //new to java 8:    static methods now in interfaces
    public static boolean isIReturn (Object obj) { return obj instanceof IReturn; }
}