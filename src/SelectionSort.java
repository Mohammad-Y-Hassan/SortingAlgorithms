/**
 * This class demonstrates the Selection Sort algorithm.
 * It sorts an array of integers in ascending order by repeatedly
 * finding the largest element from the unsorted part and moving it to the end.
 */

public class SelectionSort {
    public static void main(String[] args) {
        int [] intArray = {20, 30, 12, -2, 123, 272, 9};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }

        for (int j : intArray) {
            System.out.print(j + "\t\t");
        }
    }

    public static void swap(int [] array, int x, int y) {
        if (x == y) {
            return;
        }
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
