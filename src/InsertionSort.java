/**
 * This class demonstrates the Insertion Sort algorithm.
 * It sorts an array of integers in ascending order by building
 * a sorted section of the array one element at a time.
 */

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {12, -2, 32, 11, 12, 1, 120};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex ++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && newElement < intArray[i - 1]; i --) {
                intArray[i] = intArray[i -1];
            }
            intArray[i] = newElement;
        }

        for(int i : intArray) {
            System.out.print(i + "\t\t");
        }
    }
}
