package com.arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args){
        int[] arr = {23,53,233,4354,545,34};
//        swap(arr, 2,5);
        System.out.println(Arrays.toString(reverse(arr)));

    }

    static int[] reverse(int[] arr){
        int j =arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(i<j){
                swap(arr, i, j);
                j-=1;
            }
            else{
                break;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
