package com.nice.test;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("name","nice");
//        System.out.println(map.get("name"));
//        System.out.println(set)
        Collection values = map.values();
        System.out.println(values);
    }
}
