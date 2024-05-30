public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        for (int i : intArray) {
            System.out.print(i + "\t\t");
        }
    }
    public static void swap(int[] array, int x, int y) {
        if (x == y) {
            return;
        }
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;

    }
}
