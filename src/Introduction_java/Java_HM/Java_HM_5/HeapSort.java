package Introduction_java.Java_HM_5;

import java.util.Random;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = createArray();

        long timeStart = System.currentTimeMillis();
        HeapSort ob = new HeapSort();
        ob.sort(arr);
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
        System.out.println("Sorted array is");
        printArray(arr);
    }


    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
    static int[] createArray(){
        Random random = new Random();
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-2000, 2000);
        }
        return array;
    }
}
