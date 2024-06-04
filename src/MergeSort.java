/**
 * The MergeSort class efficiently sorts an array using the
 * divide-and-conquer strategy of breaking down the array
 * into smaller subarrays, sorting them, and merging them back together.
 * This ensures that the array is sorted in O(n log n) time complexity.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = { 2, 95, 21, -23, 5, 10, 53};

        mergeSort(intArray, 0, intArray.length);

        for (int i : intArray) {
            System.out.print(i + "\t\t");
        }
    }

    public static void mergeSort(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);
    }

    public static void merge(int[] array, int start, int mid, int end) {
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
}
