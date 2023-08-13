package Java_HM.Java_HM_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1) Вычислить n-ое треугольного число (сумма чисел от 1 до n),
//        n! (произведение чисел от 1 до n)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int result = triangle_digit(number);
        System.out.printf("%d - треугольное число %d - ого уровня\n", result, number);
        int result_fact = factorial(number);
        System.out.printf("%d - факториал числа %d", result_fact, number);
    }

    static int triangle_digit(int num) {
        return (num * (num + 1) / 2);
    }

    static int factorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }
}
