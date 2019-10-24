package com.nice.test;

public class DiGui1 {


    public void test(){
        if (CountVariable.count<5){
            CountVariable.count++;
            System.out.println(CountVariable.count);
            DiGui2 diGui2 = new DiGui2();
            diGui2.test();
        }
    }

}
