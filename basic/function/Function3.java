import java.util.Scanner;

public class Function3 {
    public static void PrintTable(int n) {

        for (int i = 1; i <= 10; i++) {
            int table = n * i;
            System.out.println(n + " x " + i + " = " + (table));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrintTable(n);
        sc.close();
    }
}
