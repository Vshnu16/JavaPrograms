package com.atos.methods;

import java.util.Scanner;

public class FactorialNumber {
    public static void fact(int num) {

        if (num <= 0) {
            System.out.println("Please, Enter the positive number..");
            return;
        }

        int f = 1;
        for (int i = num; i >= 1; i --) {
            f = f * i;
        }
        System.out.println(f);
        return;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        fact(n);
        fact(n);
        fact(n);
        fact(n);

    }
}