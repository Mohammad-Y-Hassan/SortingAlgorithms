public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 7, 3, -12, 12, 45, 5};

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex --) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if(intArray[largest] < intArray[i]) {
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
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
