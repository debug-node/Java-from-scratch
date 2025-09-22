class recta {
    int length;
    int breadth;

    recta(int l, int b) {
        length = l;
        breadth = b;
    }

    int computearea() {
        return length * breadth;
    }
}

public class rectangle2 {
    public static void main(String[] args) {
        recta r1 = new recta(10,5);
        recta r2 = new recta(6,4);
        int area1 = r1.computearea();
        System.out.println("Area of rectangle1 : "+ area1);
        int area2 = r2.computearea();
        System.out.println("Area of rectangle1 : "+ area2);
    }
}