/**
 * The QuickSort class implements the Quick Sort algorithm
 * to sort an array of integers. It uses recursive partitioning
 * to divide the array around a pivot element, ensuring elements
 * less than the pivot are left of it and those
 * greater are right of it. This process repeats
 * for subarrays until the entire array is sorted,
 * achieving an efficient average time complexity of O(n log n).
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] intArray = {-2, 10, 1, 0, 15, 32, -8};

        quickSort(intArray, 0, intArray.length);

        for(int i : intArray) {
            System.out.print(i + "\t\t");
        }
    }

    public static void quickSort(int[] array, int start, int end)  {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);
    }

    public static int partition(int[] array, int start, int end) {
        // First element of the array
        int pivot = array[start];
        int i = start;
        int j = end;

        while (i < j) {

            // NOTE: Empty loop
            while(i < j && array[--j] >= pivot);
            if (i < j) {
                array[i] = array[j];
            }

            // NOTE: Empty loop
            while (i < j && array[++i] <= pivot);
            if (i < j) {
                array[j] = array[i];
            }
        }

        array[j] = pivot;
        return j;
    }
}
