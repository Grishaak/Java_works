package Java_HM.Java_HM_1;

public class Main_2 {
    public static void main(String[] args) {
//        Вывести все простые числа от 1 до 1000
        for (int i = 2; i < 1000; i++) {
            boolean flag = true;
            for (int j = 2; j < (i / 2) +1 ; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }
}