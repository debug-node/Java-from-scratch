class maximum {
    // one parameter
    int findmax(int a) {
        return a;
    }

    // two parameter
    int findmax(int a, int b) {
        int max;
        if (a > b)
            max = a;
        else
            max = b;
        return max;
    }

    // three parameter
    int findmax(int a, int b, int c) {
        int max;
        if (a > b && a > c)
            max = a;
        else if (b > a && b > c)
            max = b;
        else
            max = c;
        return max;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        maximum m = new maximum();
        int result1 = m.findmax(30);
        System.out.println("Maximum value : " + result1);
        int result2 = m.findmax(100, 50);
        System.out.println("Maximum value : " + result2);
        int result3 = m.findmax(100, 50, 76);
        System.out.println("Maximum value : " + result3);
    }
}
