package com.nice.test;

public class DiGui2 {

    public void test(){
        if (CountVariable.count<5){
            CountVariable.count++;
            System.out.println(CountVariable.count);
            DiGui1 diGui1 = new DiGui1();
            diGui1.test();
        }
    }

    public static void main(String[] args) {
        DiGui1 diGui1 = new DiGui1();
        diGui1.test();
    }

}
