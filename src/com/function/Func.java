package com.function;

import java.util.Scanner;

public class Func {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        greeting();
        int ans = num();
        System.out.println(ans);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(go(a,b));
    }

    static void greeting(){
        System.out.println("Hello World !");
    }
    static int num(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        return a+b;
    }

    static int go(int num1,int num2){
        return num1+num2;
    }
}