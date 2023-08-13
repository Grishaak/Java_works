package Algorithms;

import java.util.Random;

public class ArrayCreate {

    public static int[] createArray(int sizeArr) {
        Random random = new Random();
        int[] array = new int[sizeArr];
        for (int i = 0; i < sizeArr; i++) {
            array[i] = random.nextInt(0, 1000000);
        }
        return array;
    }

    public static void printArray(int[] array) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            st.append(array[i]);
            st.append(" ");
//            if (i + 1 == array.length) {
//                st.append(array[i]);
//            }
        }
        System.out.println(st);
    }
}
