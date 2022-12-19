package com.atos.patterns;

public class InvertedHalfPyramid {

    public static void main(String[] args) {

        int row = 4;

        // outer for loop
        for (int i = row; i >= 1; i --) {

            // inner for loop {
            for (int j = 1; j <= i; j ++) {
                System.out.print("* ");
            }
            System.out.println ("  ");

        }
    }
}
