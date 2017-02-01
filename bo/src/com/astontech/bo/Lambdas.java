package com.astontech.bo;
import com.astontech.bo.interfaces.IReturn;
import org.apache.log4j.Logger;
import java.lang.Double;import java.lang.Object;import java.lang.Override;import java.lang.String;import java.lang.System;import java.lang.Thread;import java.util.UUID;
import java.util.function.Function;

/**
 * Created by bipin on 7/26/16.


 1)  new features to interfaces
 2)  using lambdas
 3)  creating functions on the fly
 4)  using threads
 5)  UUIDs, benefits of logging over sout's


 1) 1 functional Interface (with 1 static method and 1 abstract method)
 2) 1 Function with lambda implementation.
 3) create a thread and do something interesting.
 4) convert at least 3 enhanced for loops to .forEach() streams.

 */
    public class Lambdas implements IReturn  {

    final static Logger logger = Logger.getLogger(Lambdas.class);

    public static void main (String[] args) {

        //
        //lesson 1:     java 8 interface improvements
        //

        Lambdas lambdas = new Lambdas();
        System.out.println(lambdas.returnPerson("Corneleau "));

        System.out.println(IReturn.isIReturn(new Object()));
        System.out.println(IReturn.isIReturn(lambdas));


        //
        //lesson 2:     java 8 lambdas
        //
        // IReturn iret = (String x) -> { return x + "all the stuff"; };  // formal way of defining inputs and method body
        IReturn iret = x -> x + " you treat Nick so good ";

        //runs the method defined in the lambda expression above

        System.out.println(iret.returnPerson("Oh Corneleau "));


        Function<String, String> func = (String a) -> {
            String str = "Eric.Johnson" + a;
            return str;

        };
        System.out.println(func.apply("@gmail.com"));


//        //using lambdas to create new threads.
//        Runnable thread = () -> {
////            logger.info("NEW THREAD - TID: ");
////            System.out.print("I'm a new thread.  TID: ");
////            double x = Math.random();
////            System.out.println(x);
////            logger.info(x);
//
//            UUID uuid = UUID.randomUUID();
//            System.out.println("Thread UUID: " + uuid);
//        };
//
//        //create and run 20 threads
//        for (int i = 0; i < 20; ++i) {
//            new Thread(thread).start();
//        }

        Runnable thread1=()-> logger.info("Thread go #1");  System.out.println(" Thread 1");
        Runnable thread2=()-> logger.info("Thread go #2");  System.out.println(" Thread 2");
        Runnable thread3=()-> logger.info("Thread go #3");  System.out.println(" Thread 3");
        Runnable thread4=()-> logger.info("Thread go #4");  System.out.println(" Thread 4");
        Runnable thread5=()-> logger.info("Thread go #5");  System.out.println(" Thread 5");
        Runnable thread6=()-> logger.info("Thread go #6");  System.out.println(" Thread 6");
        Runnable thread7=()-> logger.info("Thread go #7");  System.out.println(" Thread 7");


        new Thread(thread1).start();
        new Thread(thread2).start();
        new Thread(thread3).start();
        new Thread(thread4).start();
        new Thread(thread5).start();
        new Thread(thread6).start();
        new Thread(thread7).start();



    }

        @Override
    public String returnPerson (String x) {
        return x +"AwwwYeah";
    }
}