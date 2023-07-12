package Java_seminars.Java_seminar_five;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main_3 {
    public static void main(String[] args) {
        Set<Cat> set = new HashSet<>();

        Cat cat1 = new Cat("Ваня", 123, "Роза", 7, "Синий");
        Cat cat2 = new Cat("Саша", 1223, "Доза", 1, "Серый");
        Cat cat3 = new Cat("Маша", 23, "Мимоза", 2, "Оранжевый");
        Cat cat4 = new Cat("Маша", 23, "Мимоза", 7, "Оранжевый");

        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(cat4);

        System.out.println(cat2.hashCode());
        System.out.println(cat1.hashCode());
        System.out.println(cat3.hashCode());
        System.out.println(cat4.hashCode());

//        System.out.println(cat3.equals(cat4));

//        for (Cat cat : set) {
//            System.out.println(cat);
//        }
        List<Cat> res = new ArrayList<>();
        for (Cat cat : set) {
            if (cat.age == 7){
                res.add(cat);
                System.out.println(cat);
            }
        }
    }
}
