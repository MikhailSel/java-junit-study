package org.example;

import java.util.Arrays;

public class DiagonalApp {

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        DiagonalApp diagonalApp = new DiagonalApp();
        diagonalApp.fillDiagonalN(array);
        System.out.println(Arrays.deepToString(array));
    }

    public static void fillDiagonalN2(int[][] array) {
        int arrayLength = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i + j == arrayLength - 1) {
                    array[i][j] = 5;
                }
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void fillDiagonalN(int[][] array) {
        int arrayLength = array.length;
        for (int i = 0; i < array.length; i++) {
            array[i][arrayLength - 1 - i] = 5;
        }
    }


}
