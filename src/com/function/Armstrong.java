package com.function;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(armstrong(num));
    }

    static boolean armstrong(int num){
        int sum = 0;
        int original = num;
        while(num>0) {
            int rem = num % 10;
            sum += (rem * rem * rem);
            num /= 10;
        }
        return (sum==original);
    }
}
