public class Recursion {
    public static void main(String[] args) {
        int[] intArray = {3, 2, 10, 5, 1, 0};
        for(int i : intArray) {
            for (int j = 0; j <= i; j++) {
                System.out.print(factorial(j) + "\t\t");
            }
            System.out.println("\n");
        }
    }

    public static int factorial(int num){
        if(num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
