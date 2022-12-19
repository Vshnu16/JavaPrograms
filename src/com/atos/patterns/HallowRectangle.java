package com.atos.patterns;

public class HallowRectangle {

    public static void main(String[] args) {

        int row = 4;
        int col = 5;

        // outer for loop
        for (int i = 1; i <= row; i ++){
            // inner for loop
            for (int j = 1; j <= col; j ++){

                if (i == 1 || j == 1 || i == row || j == col){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }
}
