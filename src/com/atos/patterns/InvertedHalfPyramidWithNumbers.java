package com.atos.patterns;

public class InvertedHalfPyramidWithNumbers {

    public static void main(String[] args) {

        int n = 5;

        // outer loop
        for (int i = 1; i <= n; i ++) {
            // inner loop
            for (int j = 1; j <= n - i + 1; j ++) {
                System.err.print(j + " ");
            }
            System.err.println();
        }
    }
}
