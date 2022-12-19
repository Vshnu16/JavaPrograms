package com.atos.methods;

import java.util.Scanner;

public class MultiplyMethod {

    public static int calculateMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("The Multiplication of two numbers is:" + calculateMultiplication(n1, n2));

    }
}
