package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(67);
        list.add(68);
        list.add(69);
        list.add(332);
        list.add(23423);
        list.add(2334);
        list.add(623237);
        list.add(67324);
        System.out.println(list);
        System.out.println(list.contains(332));

        list.set(0,99);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i = 0;i<5;i++){
            list2.add(in.nextInt());
        }

        System.out.println(list2);

        for(int i=0;i<5;i++){
            System.out.println(list2.get(i));
        }
    }
}
