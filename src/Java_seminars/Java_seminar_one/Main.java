package Java_seminars.Java_seminar_one;

import java.time.LocalTime;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime time = LocalTime.now();
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        int hour = time.getHour();
        if (hour >= 5 && hour < 12) {
            System.out.printf("Доброе утро, %s !", name);
        } else if (hour >= 12 && hour < 18) {
            System.out.printf("Добрый день, %s !", name);
        } else if (hour >= 18 && hour < 23) {
            System.out.printf("Добрый вечер, %s !", name);
        } else {
            System.out.printf("Доброй ночи, %s !", name);
        }
        scanner.close();
    }

}