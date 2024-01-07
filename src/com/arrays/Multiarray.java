package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multiarray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] multi = new int[3][3];
        
        for(int row=0;row<multi.length;row++){
            for(int col=0;col<multi[row].length;col++){
                multi[row][col] = in.nextInt();
            }
        }

        for(int row=0; row<multi.length;row++){
            for(int col=0;col<multi[row].length;col++){
                System.out.print(multi[row][col]+" ");
            }
            System.out.println();
        }

        for(int[] arr:multi){
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        for(int[] row:multi){
            System.out.println(Arrays.toString(row));
        }
        
//        System.out.println(Arrays.toString(multi));
    }
}
