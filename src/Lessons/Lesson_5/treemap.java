package Lessons.Lesson_5;

import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1,"Один");
        System.out.println(treeMap);
        treeMap.put(2,"Два");
        System.out.println(treeMap);
        treeMap.put(3,"Три");
        System.out.println(treeMap);
        treeMap.put(4,"четыре");
        System.out.println(treeMap);
        treeMap.put(5,"Пять");
        System.out.println(treeMap);
        System.out.println(treeMap.descendingKeySet());
        System.out.println(treeMap.descendingMap());
    }
}
