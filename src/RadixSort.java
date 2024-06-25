public class RadixSort {
    public static void main(String[] args) {
        String[] stringArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        radixSort(stringArray, 26, 5);

        for (String i : stringArray) {
            System.out.print(i + "\t");
        }
    }

    public static void radixSort(String[] array, int radix, int width) {
        for (int i = width - 1; i >= 0; i--) {
            radixSingleSort(array, i, radix);
        }
    }

    public static void radixSingleSort(String[] array, int position, int radix) {
        int numItems = array.length;
        int[] countArray = new int[radix];

        for (String value : array) {
            countArray[getIndex(position, value)]++;
        }
        // Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getIndex(position, array[tempIndex])]] =
                    array[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            array[tempIndex] = temp[tempIndex];
        }
    }

    public static int getIndex(int position, String value) {
            return value.charAt(position) - 'a';
    }
}
