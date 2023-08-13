package Java_seminars.Java_seminar_four;

import java.util.HashMap;
import java.util.Map;

public class passports {
    Map<String, String> passport = new HashMap<>();
    void addInfo(String numberPassport, String name){
        passport.put(numberPassport, name);
    }
    String printInfo(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : passport.entrySet()){
            String num = entry.getKey();
            String name = entry.getValue();
            if (name.equalsIgnoreCase(lastName)){
                stringBuilder.append(num);
                stringBuilder.append(": ");
                stringBuilder.append(name);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
