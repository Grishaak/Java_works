package Introduction_java.Java_HM_5;


public class Main_3 {
    //    На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
    public static void main(String[] args) {
        String[][] arr = new String[8][8];
        String s = "abcdefgh";
        String n = "12345678";
        char[] s1 = s.toCharArray();
        char[] n1 = n.toCharArray();
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr.length; k++) {
                String str = "";
                str += s1[j];
                str += n1[k];
                arr[j][k] = str;
                System.out.printf(" %s ", arr[j][k]);
            }
            System.out.println();
        }
    }
    static void findQueen(String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = "*";
                if (arr[i][j].equalsIgnoreCase("*"));
            }
        }
    }

}
