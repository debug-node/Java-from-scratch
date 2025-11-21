package basic.loops;

import java.util.Scanner;

public class NameCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        
        System.out.println("Dear " + name + ", you have entered " + n + " as your number for counting.");

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
