package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrList {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> multi = new ArrayList<>();

        for(int i=0;i<3;i++){
            multi.add(new ArrayList<>());
            for(int j=0;j<3;j++){
                multi.get(i).add(inp.nextInt());
            }
        }
        System.out.println(multi);
    }
}
