package Java_seminars.Java_seminar_three;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
public class Main_3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean work = true;
        try {

        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        while (work) {
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("print")) {
                ListIterator<String> listIterator = list.listIterator(list.size());
                while ((listIterator.hasPrevious())){
                    System.out.println(listIterator.previous());
                }
//                for (int i = list.size() - 1; i >= 0 ; i--) {
//                    System.out.println(list.get(i));
//                }
                System.out.println(list);
            } else if (line.equalsIgnoreCase("revert") && list.size() > 0) {
                list.removeLast();
                System.out.println(list);
            } else {
                list.add(line);
                System.out.println(list);
            }
        }
    }
}