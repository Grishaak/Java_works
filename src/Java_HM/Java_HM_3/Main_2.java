package Java_HM.Java_HM_3;

import java.util.ArrayList;
import java.util.Collections;

public class Main_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = Main.createArrayList(5);
        Integer maximum = Collections.max(list);
        Integer minimum = Collections.min(list);
        Double middle = middleAritph(list);
        System.out.println(list);
        System.out.printf("""
                %d - max
                %d - min
                %f - mid""", maximum, minimum, middle);
    }
//    public static int round(float a){
//
//    }

    static Double middleAritph(ArrayList<Integer> list) {
        double count = 0.0f;
        for (int i = 0; i < list.size(); i++) {
            count += list.get(i);
        }
        double size = list.size();
        return count / size;
    }

}
