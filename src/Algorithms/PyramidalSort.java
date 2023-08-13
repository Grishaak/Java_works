package Algorithms;

import java.util.Arrays;
import java.util.Collections;

public class PyramidalSort {
    public static void main(String[] args) {
        int[] array = ArrayCreate.createArray(11);
        ArrayCreate.printArray(array);
        heapSort(array, array.length);
        ArrayCreate.printArray(array);
    }

    public static void heapify(int[] arr, int size, int root) {
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != root) {
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            heapify(arr, size, largest);
        }
    }

    public static void heapSort(int[] array, int size) {
        for (int i = size / 2; i >= 0; i--) {
            heapify(array, size, i);
        }
        for (int i = size - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }
}
