package com.practice;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int num = in.nextInt();
        int reverse = 0;
        while (num != 0){
            int reminder = num % 10;
            reverse = reverse * 10 + reminder;
            num = num /10;
        }
        System.out.println(reverse);
        if (reverse == num){
            System.out.println("palindrom");
        }else {
            System.out.println("not");
        }
    }
}
