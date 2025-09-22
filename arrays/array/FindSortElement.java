package arrays.array;

import java.util.Scanner;

public class FindSortElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        boolean isAscending = true;

        // output
        for (int i = 0; i < size - 1; i++) {
            if (num[i] > num[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }

        sc.close();
    }
}
