package com.intro;

public class TypeCasting {
    public static void main(String[] args){
//        byte num = 56, num1 = 127;
//        String d = "my name is khan";
//        System.out.println();

        byte b = 42;
        char c = 'a';
        short s = 1023;
        int i = 23123;
        float f = 5.67f;
        double d = 0.12123;
        double result = (f*b) + (i/c) - (d*s);
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);
    }
}
