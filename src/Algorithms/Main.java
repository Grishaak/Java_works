package Algorithms;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        testForSorts();
        testForSearch();
    }

    private static void testForSorts() {
        int[] array = ArrayCreate.createArray(1000);
        int[] array2 = array.clone();
        int[] array3 = array.clone();

        long date1 = new Date().getTime();
        BubbleSort.sortBubble(array);
        long date2 = new Date().getTime();
        long date3 = date2 - date1;
        System.out.println("time for Bubble sort= " + date3);

        long date4 = new Date().getTime();
        SortQuick.sortQuick(array2, 0, array.length - 1);
        long date5 = new Date().getTime();
        long date6 = date5 - date4;
        System.out.println("time for Quick sort= " + date6);

        long date7 = new Date().getTime();
        Arrays.sort(array3);
        long date8 = new Date().getTime();
        long date9 = date8 - date7;
        System.out.println("time for Util sort= " + date9);
    }

    private static void testForSearch() {
        int[] array = ArrayCreate.createArray(1000000);
        Arrays.sort(array);
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        long date1 = new Date().getTime();
        Search.binarySearch(array, value, 0, array.length - 1);
        long date2 = new Date().getTime();
        long date3 = date2 - date1;
        System.out.println("time for binary Search= " + date3);
    }
}
