package org.example;

import java.util.Scanner;

public class TicTaoGame {






    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    int sym = scanner.nextInt();
                    array[x][y] = sym;
            }
        }
    }
}