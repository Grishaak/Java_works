package Lessons.Lesson_5;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> set_2 = new HashSet<>(Arrays.asList("2", "3", "4", "5"));
        set.add("1");
        set.add("2");
        set.add("0");
        System.out.println(set);
        System.out.println(set.contains("4"));
        System.out.println(set.contains("2"));
        HashSet<String> set_3 = new HashSet<>(set);
        set_3.removeAll(set_2);
        System.out.println(set_3);

        TreeSet<Integer> treeSet = new TreeSet<>();
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            treeSet.add(i*random.nextInt(1,3));
        }
        System.out.println(treeSet);
    }
}
