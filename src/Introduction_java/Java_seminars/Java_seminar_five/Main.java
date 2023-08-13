package Java_seminars.Java_seminar_five;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3, 2, 4, 4, 5, 9, 0};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}
