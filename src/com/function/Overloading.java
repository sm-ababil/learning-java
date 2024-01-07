package com.function;

public class Overloading {
    public static void main(String[] args){
        sum(2,3);
        sum(3,4,6);
    }

    static void sum(int a, int b){
        System.out.println("zero"+ a+b);
    }

    static void sum(int a, int b, int c){

        System.out.println("one"+ a+b+c);
    }
}
