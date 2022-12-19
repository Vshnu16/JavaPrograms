package com.atos.advancedpatterns;

public class DiamondPattern {

    public static void main(String[] args) {

        // diamond pattern
        int n = 4;

        // upper half
        for (int i = 1; i <= n; i ++) {

            // first part-> spaces
            for (int j = 1; j <= (n - i); j ++) {
                System.out.print("  ");
            }

            // second part -> stars
            for (int j = 1; j <= 2 * i - 1; j ++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        // lower half
        for (int i = n; i >= 1; i --) {

            // first part-> spaces
            for (int j = 1; j <= n - i; j ++) {
                System.out.print("  ");
            }

            // second part -> stars
            for (int j = 1; j <= 2 * i - 1; j ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
