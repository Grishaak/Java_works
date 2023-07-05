package Java_HM.Java_HM_4;

import java.util.*;

public class Main {
    //    Пусть дан LinkedList с несколькими элементами.
//    Реализуйте метод, который вернет “перевернутый”
//    список. Постараться не обращаться к листу по индексам.
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println(linkedList);
        System.out.println(reversedLinkedList(linkedList));
    }

    static ArrayList<Integer> reversedLinkedList(LinkedList<Integer> linkedList) {
        ArrayList<Integer> arrayList = new ArrayList<>(linkedList);
        Collections.reverse(arrayList);
        return arrayList;
    }
}
