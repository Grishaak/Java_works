package Lessons.Lesson_5;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<Integer, String> db = new java.util.HashMap<>();
        db.putIfAbsent(2,"два");
        db.put(3,"три");
        db.put(4,"четыре");
        System.out.println(db);
        System.out.println(db.get(44));
        System.out.println(db.containsKey(2));
        System.out.println(db.containsKey(5));
        System.out.println(db.containsValue("один"));
        System.out.println(db.containsValue("четыре"));
        System.out.println(db.keySet());
        System.out.println(db.values());

        for (var item: db.entrySet()){
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
    }
}
