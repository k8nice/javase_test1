package com.nice.test;

public class SynchronizedDemo {
    public  synchronized static void test(){
        System.out.println("nice");
    }

    public static void main(String... args){
        SynchronizedDemo.test();
    }
}
