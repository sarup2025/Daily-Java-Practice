package com.Sarup;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();
        switch (empId) {
            case 1 -> System.out.println("Sarup Chakraborty");
            case 2 -> System.out.println("Akash Roy");
            case 3 -> {
                System.out.println("Emp ID 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("Invalid emp ID");
                }
            }
        }
    }
}

