/**
 * This class demonstrates the Shell Sort algorithm.
 * It sorts an array of integers in ascending order by
 * comparing elements at a specific interval and reducing the interval over time.
 */

public class ShellSort {
    public static void main(String[] args) {
        int[] intArray = {12, 10, 1, -2, 16, 92, -9};

        for (int gap = intArray.length / 2; gap > 0; gap /= 2 ) {

            for (int i = gap; i < intArray.length; i++) {

                int newElement = intArray[i];
                int j = i;

                while (j >= gap && newElement < intArray[j - gap]) {
                    intArray[j] = intArray[j -gap];
                    j -= gap;
                }
                intArray[j] = newElement;
            }
        }

        for (int i : intArray) {
            System.out.print(i + "\t\t");
        }
    }
}
