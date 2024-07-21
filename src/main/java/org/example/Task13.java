package org.example;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double sum = a + b;
        double dif = a - b;
        double multiply = a * b;
        double quot = a / b;
        System.out.print(sum + System.lineSeparator() + dif + System.lineSeparator() + multiply + System.lineSeparator() + quot + System.lineSeparator());
    }
}
