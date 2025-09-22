package arrays.array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        // output
        for (int i = 0; i < size; i++) {
            if (num[i]==x) {
                System.out.println("x found at index: " + i);
            }
        }
        sc.close();
    }
}
