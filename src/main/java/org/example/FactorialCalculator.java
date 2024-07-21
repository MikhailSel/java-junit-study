package org.example;
//Ошибка в типе данных?

public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 3;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}


