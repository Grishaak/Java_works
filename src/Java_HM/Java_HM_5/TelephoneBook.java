package Java_HM.Java_HM_5;

import java.util.*;

public class TelephoneBook {
    Map<String, List<Integer>> book = new HashMap<>();

    void addContact(String name, Integer teleNumber) {
        if (!book.containsKey(name)) {
            List<Integer> list = new ArrayList<>();
            list.add(teleNumber);
            book.put(name, list);
        } else {
            if (book.get(name).contains(teleNumber)) {
                System.out.println("Такой номер уже есть.\n");
            } else {
                book.get(name).add(teleNumber);
            }
        }
    }

    String printAllContacts() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List<Integer>> entry : book.entrySet()) {
            String name = entry.getKey();
            List<Integer> list = entry.getValue();
            stringBuilder.append("Имя: %s\n".formatted(name));
            stringBuilder.append("Телефон/ы : [");
            String str = "";
            for (int i = 0; i < list.size(); i++) {
                if (i != list.size() - 1) {
                    str += list.get(i) + ", ";
                } else {
                    str += list.get(i);
                }
            }
            stringBuilder.append(str);
            stringBuilder.append("]\n");
        }
        return stringBuilder.toString();
    }
}
