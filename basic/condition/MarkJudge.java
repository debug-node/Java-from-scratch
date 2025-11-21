package basic.condition;

import java.util.Scanner;

public class MarkJudge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int mark = sc.nextInt();

        if (mark >= 90) {
            System.out.println("excellent");
        } else if (mark >= 80) {
            System.out.println("good");
        } else if (mark >= 70) {
            System.out.println("fair");
        } else if (mark >= 60) {
            System.out.println("meets expectations");
        } else {
            System.out.println("below par");
        }
        sc.close();
    }
}