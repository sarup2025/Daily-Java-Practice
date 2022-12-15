package com.sarup;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take the inputs from user till user does not press x or X
        int ans = 0;
        while (true){
            //Take the operators
            System.out.print("Enter the Operator:  ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //input two numbers
                System.out.print("Enter first number: ");
                int num1 = in.nextInt();
                System.out.print("Enter second number: ");
                int num2 = in.nextInt();
                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
                if (op == '/'){
                    if (num2 !=0){
                        ans = num1 / num2;
                    }
                }
             }  else if (op == 'x' || op == 'X') {
                break;
            }
             else {
                System.out.println("Invalid Operations");
          }
            System.out.println ("The result is: " + ans);

        }

    }
}
