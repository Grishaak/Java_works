package Java_HM.Java_HM_1;

import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        start();
    }


    static int sum(int one, int two) {
        return one + two;
    }

    static int diff(int one, int two) {
        return one - two;
    }

    static int div(int one, int two) {
        return one / two;
    }

    static int multi(int one, int two) {
        return one * two;
    }


    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введие число: ");
        int first_number = scanner.nextInt();
        System.out.print("Введите число: ");
        int second_number = scanner.nextInt();
        System.out.print("""
                 1 - Операция сложения
                 2 - Операция вычитания
                 3 - Операция деления
                 4 - Операция умножения
                 5 - Выйти из калькулятора
                """);
        System.out.println("Выберите операцию: ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1 -> System.out.println(sum(first_number, second_number));
            case 2 -> System.out.println(diff(first_number, second_number));
            case 3 -> System.out.println(div(first_number, second_number));
            case 4 -> System.out.println(multi(first_number, second_number));
        }
    }
}