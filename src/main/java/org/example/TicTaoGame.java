package org.example;

import java.util.Random;
import java.util.Scanner;

//Первый игрок начинает с крестика
//После каждого хода проверка на победителя
//Проверка на пустоту
//Разбить на методы: validate, checkWin - понять, что победа и кто победитель
//Формат хода x пробел y - первый ход = 1 (текущий ходит)


//Игра с компьютером (комп должен найти незанятое поле и заполнить его выбранным для него значением - комп ходит вторым)

public class TicTaoGame {

    public static void main(String[] args) {
        TicTaoGame ticTaoGame = new TicTaoGame();
        ticTaoGame.play();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][3];
        int current = 1;
        int x = 0;
        int y = 0;

        for (int i = 0; i <= 1000; i++) {
            if (current == 1) {
                String line = scanner.nextLine();
                char charX = line.charAt(0);
                char charY = line.charAt(2);

                //приведение типов
                x = (int) charX - '0';
                y = (int) charY - '0';
            } else {
                int[] result = getRandomPosition(array);
                x = result[0];
                y = result[1];

            }

            if (array[x][y] != 0) {
                System.out.println("Данное поле занято");
                continue;
            }

            array[x][y] = current;
            printArray(array);


            int isWin = checkWin(array, current);
            if (isWin == 0) {
                System.out.println("Никто не выиграл");
            } else {
                System.out.println("Выиграли " + isWin);
                break;
            }

            if (current == 1) {
                current = -1;
            } else {
                current = 1;
            }


            boolean isFinishGame = checkFinishGame(array);
            if (isFinishGame) {
                System.out.println("Игра закончена");
                break;
            }
        }
    }

    public int checkWin(int[][] array, int current) {
        for (int i = 0; i < array.length; i++) {
            //проверка по строкам
            if (array[0][i] == current
                    && array[1][i] == current
                    && array[2][i] == current) {
                return current;
            }
            //проверка по столбцам
            if (array[i][0] == current
                    && array[i][1] == current
                    && array[i][2] == current) {
                return current;
            }
            //проверка по диагонали
            if (array[0][0] == current
                    && array[1][1] == current
                    && array[2][2] == current) {
                return current;
            }
            //проверка по диагонали
            if (array[0][2] == current
                    && array[1][1] == current
                    && array[2][0] == current) {
                return current;
            }
        }
        return 0;
    }

    public void printArray(int[][] arrayForPrint) {
        for (int i = 0; i < arrayForPrint.length; i++) {
            for (int j = 0; j < arrayForPrint[i].length; j++) {
                System.out.print(" " + arrayForPrint[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean checkFinishGame(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    //создать переменную, которая иттерационно будет заполняться в зависимости от количества найденных пустых ячеек
    public int[] getRandomPosition(int[][] array) {
        int[][] saveResult = new int[9][];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array[j].length; k++) {
                if (array[j][k] == 0) {
                    int[] result = new int[2];
                    result[0] = j;
                    result[1] = k;
                    saveResult[index] = result;
                    index = index + 1;
                }
            }
        }
        int randomIndex = new Random().nextInt(index);
        return saveResult[randomIndex];
    }

}






