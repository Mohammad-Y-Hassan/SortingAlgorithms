import java.util.Arrays;
public class SortingUsingJdk {
    public static void main(String[] args) {
        int[] intArray1 = {20, 5, 10, -2, -10, 2, 4, 1};
        int[] intArray2 = {20, 5, 10, -2, -10, 2, 4, 1};

        Arrays.sort(intArray1);
        Arrays.parallelSort(intArray2);

        for (int i : intArray1) {
            System.out.print(i + "\t\t");
        }
        System.out.println("\n");
        for (int i : intArray2) {
            System.out.print(i + "\t\t");
        }
    }
}
