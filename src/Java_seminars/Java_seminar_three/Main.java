package Java_seminars.Java_seminar_three;

import java.util.ArrayList;
import java.util.LinkedList;
public class Main {
    /*
    1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
    2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
     */
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        LinkedList list2 = new LinkedList();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list2.add(0, i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }
}
