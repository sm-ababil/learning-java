package com.conditional;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        switch (num) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Tue");
                break;
            case 5:
                System.out.println("Wed");
                break;
            case 6:
                System.out.println("Thu");
                break;
            case 7:
                System.out.println("Fri");
                break;
            default:
                System.out.println("Enter valid date.");
                break;
        }
    }
}
