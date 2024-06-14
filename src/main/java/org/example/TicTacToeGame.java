package org.example;

public class TicTacToeGame {
    public static void main(String[] args) {

        //      int[] array = new int[3];
        //      array[0] = 1;
        //       array[1] = 2;
        //      array[2] = 3;
        //      for (int i = 0; i < array.length; i++) {
        // System.out.println(array[i]);
        //   }

        //        int[] array2 = new int[3];
        //       array2[0] = 4;
        //      array2[1] = 5;
        //   array2[2] = 6;

        //    int[][] doubleArray = new int[2][];
        //   doubleArray[0] = array;
        //   doubleArray[1] = array2;
        //   for (int i = 0; i < doubleArray.length; i++) {
        //      for (int j = 0; j < doubleArray[i].length; j++) {
        //           System.out.println(doubleArray[i][j]);
        //       }
        //   }

        int[][] doubleArray2 = new int[3][3];
        //  doubleArray2[0][0] = 9;
        //  doubleArray2[1][1] = 9;
        //  doubleArray2[2][2] = 9;
        //  doubleArray2[0][2] = 9;
        //  doubleArray2[1][1] = 9;
        //  doubleArray2[2][0] = 9;
        // System.out.print(Arrays.deepToString(doubleArray2));

        for (int i = 0; i < doubleArray2.length; i++) {
            for (int j = 0; j < doubleArray2[i].length; j++) {
                //  if (i == j || (i + j) == 2) {
                doubleArray2[i][j] = 9;
                System.out.print(" " + doubleArray2[i][j] + " ");
            }
            System.out.println();

        }

    }


}



