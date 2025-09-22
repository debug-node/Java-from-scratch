package exception;

class MyException extends Exception {
    public static int accno[] = { 1001, 1002, 1003 };
    public static String name[] = { "Ram", "Prem", "Ritik" };
    public static double bal[] = { 999.99, 888.99, 77.99 };

    MyException() {
    }

    MyException(String str) {
        super(str);
    }
}

public class UserdefinedException {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(MyException.accno[i] + "\t" + MyException.name[i] + "\t" + MyException.bal[i]);
                if (MyException.bal[i] < 100) {
                    MyException me = new MyException("Balance is low");
                    throw me;
                }
            }
        } catch (MyException me) {
            me.printStackTrace();
        }
    }
}
