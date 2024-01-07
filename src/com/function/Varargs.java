package com.function;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args){
        fun(2,4,5,6,3,4,34,34);
        mult(23,23,"var","dow");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void mult(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }
}
