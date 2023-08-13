package Introduction_java.Java_HM_5;


import java.util.*;

public class Main_2 {
    //    Пусть дан список сотрудников: Иван Иванов, Светлана Петрова,
//    Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков,
//    Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова,
//    Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова,
//    Иван Мечников, Петр Петин, Иван Ежов. Написать программу,
//    которая найдет и выведет повторяющиеся имена с количеством повторений.
//    Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
    public static void main(String[] args) {
        String s = "Иван Иванов, Светлана Петрова,\n" +
                "Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков,\n" +
                "Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова,\n" +
                "Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова,\n" +
                "Иван Мечников, Петр Петин, Иван Ежов";
        String[] arrString = s.strip().split(",");
        for (int i = 0; i < arrString.length; i++) {
            arrString[i] = arrString[i].strip();
            System.out.println(arrString[i]);
        }
        System.out.println();
        firstNames(arrString);
        firstNamesRepeats(arrString);
    }

    static void firstNames(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String[] str = arr[i].split("");
            String temp = "";
            for (String s : str) {
                if (s.equals(" ")) {
                    break;
                } else {
                    temp += s;
                }
            }
            arr[i] = temp;
            System.out.println(arr[i]);
        }
    }

    static void firstNamesRepeats(String[] arr) {
        Map<String, Integer> map = new TreeMap<>();
        for (String word : arr) {
            if (!map.containsKey(word)) {
                int number = 1;
                map.putIfAbsent(word, number);
            } else {
                map.replace(word, map.get(word) + 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println("Sorted by values:");
        System.out.println(list);
//        return map;
    }
}