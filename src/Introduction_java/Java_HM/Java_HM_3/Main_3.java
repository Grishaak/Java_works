package Introduction_java.Java_HM_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main_3 {
    //    Заполнить список названиями планет
//    Солнечной системы в произвольном порядке
//    с повторениями. Вывести название каждой
//    планеты и количество его повторений в списке.
//    Collections.frequency(list, item)
    public static void main(String[] args) {
        String[] solar = {"Earth", "Mercury", "Venus",
                "Mars", "Saturn", "Jupiter", "Uranus",
                "Pluto", "Neptune"};
        ArrayList<String> solarSys = solarSystem(solar);
        System.out.println(solarSys);
        frequency(solar, solarSys);
    }

    static ArrayList<String> solarSystem(String[] solar) {
        Random random = new Random();
        ArrayList<String> solarSys = new ArrayList<>();
        for (int i = 0; i < solar.length; i++) {
            int rng = random.nextInt(1, 5);
            if (rng > 1) {
                for (int j = 0; j < rng; j++) {
                    solarSys.add(solar[i]);
                }
            } else {
                solarSys.add(solar[i]);
            }
        }
        Collections.shuffle(solarSys);
        return solarSys;
    }

    static void frequency(String[] solar, ArrayList<String> solarSys) {
        for (int i = 0; i < solar.length; i++) {
            int collect = Collections.frequency(solarSys, solar[i]);
            System.out.printf("%s - %d\n", solar[i], collect);
        }
    }
}
