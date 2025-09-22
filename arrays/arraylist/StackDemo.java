package arrays.arraylist;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> St = new Stack<Integer>();
        St.push(10);
        St.push(20);
        St.push(30);
        St.push(40);
        System.out.println("popped element is : " + St.pop());
        Integer position = St.search(10);
        System.out.println("position of element is : " + position); 
    }
}
