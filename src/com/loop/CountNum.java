package com.loop;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while(n>0){
            if(n%10==5){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
