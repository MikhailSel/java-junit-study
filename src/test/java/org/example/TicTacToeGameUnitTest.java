package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TicTacToeGameUnitTest {

    //Переписать, не использовать Ифы, не писать логику, тестировать только методы

    @Test
    @DisplayName("Проверка заполнения диагоналей")
    void isAddressHaveFalse() {
        //GIVEN
        int[][] doubleArray1 = new int[3][3];
        doubleArray1[0][0] = 9;
        doubleArray1[1][1] = 9;
        doubleArray1[2][2] = 9;
        doubleArray1[0][2] = 9;
        doubleArray1[1][1] = 9;
        doubleArray1[2][0] = 9;
        //WHEN
        int[][] doubleArray2 = new int[3][3];
        for (int i = 0; i < doubleArray2.length; i++) {
            for (int j = 0; j < doubleArray2[i].length; j++) {
                if (i == j || (i + j) == 2) {
                    doubleArray2[i][j] = 9;
                }
            }
        }
        boolean result = Arrays.deepEquals(doubleArray1, doubleArray2);
        Assertions.assertEquals(true, result);
    }
}