package Algorithms;

public class SortQuick {
    public static void main(String[] args) {
        int[] array = ArrayCreate.createArray(30);
        ArrayCreate.printArray(array);
        sortQuick(array, 0, array.length - 1);
        ArrayCreate.printArray(array);
    }

    public static void sortQuick(int[] array, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition) / 2];
        while (leftPosition <= rightPosition) {
            while (array[leftPosition] < pivot) {
                leftPosition++;
            }
            while (array[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        }
        if (leftPosition < endPosition) {
            sortQuick(array, leftPosition, endPosition);
        }
        if (startPosition < rightPosition)
            sortQuick(array, startPosition, rightPosition);
    }
}

