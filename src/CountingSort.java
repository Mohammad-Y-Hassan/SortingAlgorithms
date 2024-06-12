/**
 * The CountingSort class implements the Counting Sort
 * algorithm to sort an array of integers within a
 * specified range. It first counts occurrences of each
 * element using a count array, then reconstructs the
 * sorted array from this count data. This non-comparative
 * sorting algorithm is efficient for sorting numbers with a
 * limited range, offering linear time complexity, O(n + k),
 * where k is the range of the input.
 * However, this is an unstable sorting algorithm.
 */
public class CountingSort {
    public static void main(String[] args) {
        int[] intArray = { 2, 3, 2, 1, 9, 7, 10, 6, 8, 7, 4 };

        countingSort(intArray, 1, 10);

        for (int i : intArray) {
            System.out.print(i + "\t\t");
        }
    }

    public static void countingSort(int[] array, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i : array) {
            countArray[i - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                array[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
