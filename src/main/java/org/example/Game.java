package org.example;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private int randomNumLength;

    private int tryCount;

    public Game(int randomNumLength, int tryCount) {
        this.randomNumLength = new Random().nextInt(randomNumLength);
        this.tryCount = tryCount;
    }

    public void run() {
        String userDesire;
        do {
            int randomNum = new Random().nextInt(this.randomNumLength);
            System.out.println(randomNum);
            game(randomNum);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Хотите поиграть еще?");
            userDesire = scanner.next();
        } while (userDesire.equals("Да"));
    }

    private void game(int num) {
        for (int i = 0; i < this.tryCount; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Укажите число от 0 до 9");
            int number = sc.nextInt();
            if (num > number) {
                System.out.println("Введенное числе меньше загаданного");
            } else if (num < number) {
                System.out.println("Введенное числе больше загаданного");
            } else {
                System.out.println("Вы угадали число");
                break;
            }
        }



    }

}
