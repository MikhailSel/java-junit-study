package org.example;

public class TicTacToeGame {
    public static void main(String[] args) {
        int[][] doubleArray2 = new int[5][5];
        for (int i = 0; i < doubleArray2.length; i++) {
            for (int j = 0; j < doubleArray2[i].length; j++) {
                if (i == j || (i + j) == 4) {
                    doubleArray2[i][j] = 5;
                }
                System.out.print(" " + doubleArray2[i][j] + " ");
            }
            System.out.println();
        }
    }
}


