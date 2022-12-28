package com.practice;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter first number: ");
        int num1 = in.nextInt();
        System.out.println("enter second number: ");
        int num2 = in.nextInt();
        if (num1>num2){
            System.out.println(num1+" is the largest");
        }else {
            System.out.println(num2+" is the largest");
        }
    }
}
