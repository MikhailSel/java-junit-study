package org.example;
//Цикл начинался со значения под индексом 1, а не 0. В массиве первое значение имеет индекс 0.

public class ElementIndexFinder {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 12;
        int index = findElementIndex(numbers, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    public static int findElementIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

// что если не найду, что если найду
// мэйн не тестируем