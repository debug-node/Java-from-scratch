package arrays.array;
import java.util.Arrays;

public class arraysdemo {

    public static void main(String[] args) {
        int arr[];
        //int arr2[];

        arr = new int[10];
        System.out.println("Length of arr: " + arr.length);
        System.out.println("Default value of arr[0]: " + arr[0]);

        double arr3[] = new double[10];
        System.out.println("Default value of arr3[0]: " + arr3[0]);

        boolean arr4[] = new boolean[10];
        System.out.println("Default value of arr4[0]: " + arr4[0]);

        // Safe check before accessing index
        int indexToCheck = 9; // last valid index
        if (indexToCheck < arr4.length) {
            System.out.println("arr4[" + indexToCheck + "]: " + arr4[indexToCheck]);
        }

        int[] arr5 = {3, 2, 1};

        int matrix[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("matrix[0][2]: " + matrix[0][2]);

        int[][] matrix2 = new int[10][10];
        System.out.println("First row of matrix2: " + Arrays.toString(matrix2[0]));

        // Printing arr5 before sorting
        System.out.println("arr5 before sort: " + Arrays.toString(arr5));
        Arrays.sort(arr5);
        System.out.println("arr5 after sort: " + Arrays.toString(arr5));

        // Printing full matrix
        System.out.println("Full matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
