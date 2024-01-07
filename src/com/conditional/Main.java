package com.conditional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);    //trim() for unnecessary space      charAt() character in index

        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
