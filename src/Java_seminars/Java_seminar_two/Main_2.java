package Java_seminars.Java_seminar_two;

public class Main_2 {
    //    Напишите метод, который сжимает строку.
//    Пример: вход aaaabbbcdd.
//    Результат: a4b3cd2
    public static void main(String[] args) {
        String str = "aaaabbbcddddccdcd";
        System.out.println(redux(str));

    }

    static String redux(String line) {
        char[] chars = line.toCharArray();
        int count = 1;
        StringBuilder str_build = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1])
                count++;
            else {
                str_build.append(chars[i - 1]);
                if (count != 1) {
                    str_build.append(count);
                    count = 1;
                }

            }

        }
        str_build.append(chars[chars.length - 1]);
        if (count != 1) {
            str_build.append(count);
        }
        return str_build.toString();
    }
}
