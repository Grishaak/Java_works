package Algorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int[] array = ArrayCreate.createArray(400);
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        ArrayCreate.printArray(array);
        long t1 = System.currentTimeMillis();
        int number = find(array, value);
        long t2 = System.currentTimeMillis();
        long t3 = t2 - t1;
        System.out.println("Time spent to find: " + t3 + ", int: " + number);
        Arrays.sort(array);
        ArrayCreate.printArray(array);
        int secNumber = binarySearch(array, value, 0, 1000);
        System.out.println("Binary search: " + secNumber);
    }

    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int value, int min, int max) {
        int midPoint;
        if (max < min) {
            return -1;
        } else {
            midPoint = (max - min) / 2 + min;
        }
        if (array[midPoint] < value) {
            return binarySearch(array, value, midPoint + 1, max);
        } else {
            if (array[midPoint] > value) {
                return binarySearch(array, value, min, midPoint - 1);
            } else {
                return midPoint;
            }
        }
    }
}
