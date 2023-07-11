package Java_seminars.Java_seminar_four;

import java.util.*;

public class Main_4 {
    //    Взять набор строк, например,
//    Мороз и солнце день чудесный
//    Еще ты дремлешь друг прелестный
//    Пора красавица проснись.

    //    Написать метод, который отсортирует эти
//    строки по длине с помощью TreeMap.
//    Строки с одинаковой длиной не должны “потеряться”.
    public static void main(String[] args) {
        String s = "Мороз и солнце день чудесный,\n" +
                " Еще  ты  дремлешь друг друг прелестный\n" +
                "Пора  красавица проснись.";
        s = s.replace(".", "");
        s = s.replace("\n", " ");
        String[] words = s.split(" ");

        Map<Integer, List<String>> map = new TreeMap<>();
        for(String word: words){
            int len = word.length();
            if (map.containsKey(len)){
                List<String> list = map.get(len);
                list.add(word);

            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }
        System.out.println(map);
    }
}
