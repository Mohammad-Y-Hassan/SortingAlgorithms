/**
 * The MergeSort class efficiently sorts an array using the
 * divide-and-conquer strategy of breaking down the array
 * into smaller sub-arrays, sorting them, and merging them back together.
 * This process is done in both ascending and descending order.
 * This ensures that the array is sorted in O(n log n) time complexity.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] intArray1 = { 2, 95, 21, -23, 5, 10, 53};

        mergeSortAscending(intArray1, 0, intArray1.length);
        for (int i : intArray1) {
            System.out.print(i + "\t\t");
        }

        System.out.println("\n");

        mergeSortDescending(intArray1, 0, intArray1.length);
        for (int i : intArray1) {
            System.out.print(i + "\t\t");
        }
    }

    public static void mergeSortAscending(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (end + start) / 2;
        mergeSortAscending(array, start, mid);
        mergeSortAscending(array, mid, end);
        mergeAscending(array, start, mid, end);
    }

    public static void mergeAscending(int[] array, int start, int mid, int end) {
        if (array[mid - 1] <= array[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }

    public static void mergeSortDescending(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSortDescending(array, start, mid);
        mergeSortDescending(array, mid, end);
        mergeDescending(array, start, mid, end);
    }

    public static void mergeDescending(int[] array, int start, int mid, int end) {
        if (array[mid - 1] >= array[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = array[i] >= array[j] ? array[i++] : array[j++];
        }
        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }
}
