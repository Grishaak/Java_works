package Java_seminars.Java_seminar_two;

public class Main {
    //    Дано четное число N (>0) и символы c1 и c2.
//    Написать метод, который вернет строку длины
//    N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
//    Ответ: c1c2c1…c2 (всего N символов)
    public static void main(String[] args) {
        char c1 = '%';
        char c2 = '&';
        int number = 16;
        String string = sequence(c1, c2, number);
        System.out.println(string);
    }

    static String sequence(char c1, char c2, int num) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < num / 2; i++) {
            str.append(c1);
            str.append(c2);
        }
        return str.toString();
    }
}
