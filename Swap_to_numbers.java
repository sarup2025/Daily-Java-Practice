package com.gfg;

import java.util.Scanner;

public class Swap_to_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = in.nextInt();
        System.out.println("Enter second number");
        int n2 = in.nextInt();
        System.out.println("you have entered "+n1+" as first number and "+n2+" as second number");
        System.out.println("new first is "+n2+" and new second is "+n1);
    }
}
