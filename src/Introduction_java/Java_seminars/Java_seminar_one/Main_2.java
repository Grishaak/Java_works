package Java_seminars.Java_seminar_one;

import java.util.Scanner;
import java.util.Random;

public class Main_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size_arr = scanner.nextInt();
        int[] array = generate_array(size_arr);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
        find_max_true_sequence(array);
    }

    static int[] generate_array(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            Random rng = new Random();
            arr[i] = rng.nextInt(2);
        }

        return arr;
    }

    static void find_max_true_sequence(int[] arr) {
        int count = 0;
        int max = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                count++;
                temp = count;
            } else {
                if (temp > max) {
                    max = temp;
                }
                count = 0;
            }
        }
        System.out.printf("%d - колличество подряд идущих едениц в массиве", max);
    }
}
