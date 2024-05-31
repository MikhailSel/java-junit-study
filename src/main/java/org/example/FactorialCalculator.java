package org.example;
//Ошибка в типе данных?

public class FactorialCalculator {
    public static void main(String[] args) {
        double number = 100;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }

    public static double factorial(double n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}


