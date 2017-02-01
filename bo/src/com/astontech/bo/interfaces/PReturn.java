package com.astontech.bo.interfaces;

import java.lang.FunctionalInterface;import java.lang.Object; /**
 * Created by ericjohn1 on 7/27/2016.
 */
    @FunctionalInterface
    public interface PReturn {

        //functional interfaces:    one abstract method, as many instance or static methods as you'd like.
        public int returnInt(int x);
        //public abstract int returnInt2(String x);

        //new to java 8:    default methods (cannot be used with @FunctionalInterfaces
        //public default int returnInt(int x) { return x; }

        //new to java 8:    static methods now in interfaces
        public static boolean isIReturn(Object obj) { return obj instanceof IReturn; }
}
