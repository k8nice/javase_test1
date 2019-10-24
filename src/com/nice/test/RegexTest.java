package com.nice.test;

public class RegexTest {

    public static void main(String[] args) {
        String str = "1234";
        System.out.println(str.matches("^[0-9]*$"));
    }

}
