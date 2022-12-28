package com.practice;

import java.util.Scanner;

public class Sumoftwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the second number");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
