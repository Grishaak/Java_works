package Java_HM.Java_HM_6;


import java.util.*;

public class Main {
    List<Notebook> list = new ArrayList<>();

    public static void main(String[] args) {
        List<Notebook> list = new ArrayList<>();

        Notebook notebook_1 = new Notebook("Asus", "IPS", "4", "120", "Windows", "White");
        Notebook notebook_2 = new Notebook("Huawei", "TN", "8", "480", "Windows", "Black");
        Notebook notebook_3 = new Notebook("Asus", "VS", "4", "560", "Linux", "Black");
        Notebook notebook_4 = new Notebook("MSI", "IPS", "4", "120", "Windows", "Grey");
        Notebook notebook_5 = new Notebook("GIGABYTE", "IPS", "12", "1000", "Linux", "Metalic");
        Notebook notebook_6 = new Notebook("MSI", "IPS", "12", "120", "Windows", "Black");
        Notebook notebook_7 = new Notebook("MSI", "IPS", "10", "120", "Windows", "Black");
        Notebook notebook_8 = new Notebook("MSI", "IPS", "8", "120", "Linux", "Black");
        Notebook notebook_9 = new Notebook("MSI", "IPS", "4", "120", "Windows", "Black");

        list.add(notebook_1);
        list.add(notebook_2);
        list.add(notebook_3);
        list.add(notebook_4);
        list.add(notebook_5);
        list.add(notebook_6);
        list.add(notebook_7);
        list.add(notebook_8);
        list.add(notebook_9);

        filter(list);
    }

    static void filter(List<Notebook> list) {

        Map<Integer, Map<String, String>> map = new HashMap<>();
        for (Notebook notebook : list) {
            Map<String, String> first_map = Map.of(
                    "model", notebook.model,
                    "ram", notebook.RAM,
                    "memory", notebook.memory,
                    "os", notebook.OS,
                    "colour", notebook.colour,
                    "matrix", notebook.matrix);
            map.put(notebook.idNotebook, first_map);
        }
        System.out.println(map);
        System.out.println("""
                1 - model
                2 - ram
                3 - memory
                4 - os
                5 - colour
                6 - matrix""");
        Map<String, String> test = Map.of(
                "1", "model",
                "2", "ram",
                "3", "memory",
                "4", "os",
                "5", "colour",
                "6", "matrix"
        );
        System.out.println("""
                Выберите критерии фильтраций в цифровом виде,
                необходимо выбрать как минимум один, как максимум все,
                Вводите числа через пробел:\s""");
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        while (scan.isEmpty()) {
            System.out.println("Пусто значение, введите заново");
            scan = scanner.nextLine();
        }
        String[] new_scan = scan.split(" ");
        List<String> another_list = new ArrayList<>();
        List<String> filter_list = new ArrayList<>();
        for (int i = 0; i < new_scan.length; i++) {
            System.out.printf("Введите значение критерия, по пункту %s: ", test.get(new_scan[i]));
            String value = scanner.nextLine();
            filter_list.add(test.get(new_scan[i]));
            another_list.add(value);
        }
        for (int i = 0; i < map.size(); i++) {
            boolean flag = true;
            for (int j = 0; j < filter_list.size(); j++) {
                if (!(map.get(i).get(filter_list.get(j)).equalsIgnoreCase(another_list.get(j)))) {
                    flag = false;
                    break;
                }
            }
//        for (int i = 0; i < map.size(); i++) {
//            boolean flag = true;
//            for (int j = 0; j < another_list.size(); j++) {
//                if (!(map.get(i).containsValue(another_list.get(j)))) {
//                    flag = false;
//                    break;
//                }
//            }
            if (flag) {
                System.out.printf("id ноутбука - %d\n", i);
                System.out.printf("Model : %s\n", map.get(i).get("model"));
                System.out.printf("RAM : %s gb\n", map.get(i).get("ram"));
                System.out.printf("Memory : %s gb\n", map.get(i).get("memory"));
                System.out.printf("OS : %s\n", map.get(i).get("os"));
                System.out.printf("Colour : %s\n", map.get(i).get("colour"));
                System.out.printf("Matrix : %s\n\n", map.get(i).get("matrix"));
            }
        }
    }
}