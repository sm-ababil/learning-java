package com.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Arr {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
        int[] arr= new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }


        for(int j:arr){
            System.out.print(j+" ");
        }

        System.out.println(Arrays.toString(arr));

//        System.out.println(Arrays.toString(arr));
    }
}
