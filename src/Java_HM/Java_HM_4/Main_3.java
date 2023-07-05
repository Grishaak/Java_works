package Java_HM.Java_HM_4;


import java.util.*;

public class Main_3 {

    //    Найдите сумму всех элементов LinkedList,
//    сохраняя все элементы в списке. Используйте итератор
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        count(linkedList);
    }
    static void count(LinkedList<Integer> linkedList){
        Random random = new Random();
        linkedList.add(random.nextInt(-10, 30));
        linkedList.add(random.nextInt(-10, 30));
        linkedList.add(random.nextInt(-10, 30));
        ArrayList<Integer> arrayList = new ArrayList<>(linkedList);
        System.out.println(arrayList);
        Iterator<Integer> iterator = linkedList.iterator();
        Integer count = 0;
        while (iterator.hasNext()) {
            count += iterator.next();
        }
        System.out.println(count);
    }
}