package Java_HM.Java_HM_3;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    //    Пусть дан произвольный список целых чисел, удалить из него четные числа
    public static void main(String[] args) {
        ArrayList<Integer> list = createArrayList(10);
        System.out.println(list);
        checkOdds(list);
        System.out.println(list);
    }

    static ArrayList<Integer> createArrayList(int size) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(-10, 10));
        }
        return list;
    }

    static void checkOdds(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }
}
