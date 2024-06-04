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
