package com.nice.test;

import java.io.Serializable;

public class SerializableTest implements Serializable {
    public static void main(String[] args) {
        Object obj = "nice";
        System.out.println(obj +"test");
    }
}
