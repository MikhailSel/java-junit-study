package org.example;

//Обращение к элементу массива по индексу, который выходит за его границы (array.length - 1)
public class MaxElementFinder {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 2, 0, 3};
        System.out.println("The maximum element is: " + findMax(numbers, 3));
    }

    public static int findMax(int[] array, int target) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}