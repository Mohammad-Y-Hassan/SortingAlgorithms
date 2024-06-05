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
