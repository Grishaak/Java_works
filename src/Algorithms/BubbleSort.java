package Algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = ArrayCreate.createArray(30);
        ArrayCreate.printArray(array);
        sortBubble(array);
//        SortQuick.sortQuick(array,0,array.length -1 );
        ArrayCreate.printArray(array);
    }

    public static void sortBubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
