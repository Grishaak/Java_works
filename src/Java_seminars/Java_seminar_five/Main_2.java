package Java_seminars.Java_seminar_five;

import java.util.*;

public class Main_2 {
    //    1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
//    2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
//    Для вычисления процента используйте формулу:
//    процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    public static void main(String[] args) {
        Integer[] arr = createArray(10, 0, 24);
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("Процент цникальности: " + getUnicPercent(arr));
    }

    static double getUnicPercent(Integer[] arr) {
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        System.out.println(set);
        double result = (double) set.size() * 100.0 / arr.length;
        return result;
    }

    static Integer[] createArray(int size, int min, int max) {
        Integer[] arr = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(max - min + 1) + min;
        }
        return arr;
    }
}
