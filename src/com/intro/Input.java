package com.intro;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter some number: ");
        int rollno = input.nextInt();
        System.out.println("Your roll no: " + rollno);
    }
}
