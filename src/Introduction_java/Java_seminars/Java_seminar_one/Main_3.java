package Java_seminars.Java_seminar_one;

public class Main_3 {
    public static void main(String[] args) {
        String line = "Добро пожаловть на курс по Java";
        String new_line = reverse(line);
        System.out.println(new_line);
    }

    static String reverse(String line) {
        String[] temp = line.split(" ");
        String res = "";
        for (int i = temp.length - 1; i > -1; i--) {
            if (i == 0) {
                res += temp[i];
            } else {

                res += temp[i] + " ";
            }
        }
        return res;
    }
}
