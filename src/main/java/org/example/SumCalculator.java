package org.example;
//Цикл начинался со значения под индексом 1, а не 0. В массиве первое значение имеет индекс 0.

public class SumCalculator {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("The sum of the array elements is: " + calculateSum(numbers));
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}