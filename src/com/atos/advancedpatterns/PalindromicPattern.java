package com.atos.advancedpatterns;

public class PalindromicPattern {

    public static void main(String[] args) {

        // palindromic pattern

        int n = 5;

        for (int i = 1; i <= n; i ++) {

            // spaces print
            int spaces = n - i;
            for (int j = 1; j <= spaces; j ++){
                System.out.print("  ");
            }

            // bac
            for (int j = i; j >= 1; j --){
                System.out.print(j + " ");
            }

            // print numbers in the right order
            for (int j = 2; j <= i; j ++) {
                System.out.print(j + " ");
            }

            System.out.println();

        }
    }
}
