package Java_HM.Java_HM_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main_4 {
    public static void main(String[] args) {
//        Задано уравнение вида q + w = e, q, w, e >= 0.
//        Некоторые цифры могут быть заменены знаком вопроса,
//        например, 2? + ?5 = 69. Требуется восстановить
//        выражение до верного равенства.
//        Предложить хотя бы одно решение или сообщить, что его нет.
        start();
    }

    static void start() {
        String str = "2?+?5=69";
//        System.out.printf("%s",str);
        String[] new_str = str.split("=");
        for (int i = 0; i < new_str.length; i++) {
            System.out.println(new_str[i]);

        }

    }
}

