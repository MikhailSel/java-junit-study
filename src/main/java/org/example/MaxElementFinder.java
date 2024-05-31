package org.example;
//Обращение к элементу массива по индексу, который выходит за его границы (array.length - 1)
public class MaxElementFinder {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 2};
        System.out.println("The maximum element is: " + findMax(numbers));
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i <= array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}