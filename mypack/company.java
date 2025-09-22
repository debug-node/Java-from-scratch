package mypack;

class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal < 0) {
            System.out.println("-->");
        }
        System.out.println(name + " " + bal);
    }
}

public class company {
    public static void main(String[] args) {
        int i;
        Balance current[] = new Balance[3];
        current[0] = new Balance("Ram", 80000);
        current[1] = new Balance("Shyam", 60000);
        current[2] = new Balance("Mohan", 70000);
        for (i = 0; i < 3; i++) {
            current[i].show();
        }
    }
}
