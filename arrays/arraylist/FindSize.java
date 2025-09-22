package arrays.arraylist;

import java.util.ArrayList;

public class FindSize {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<String>();
        List.add("Blue");
        List.add("Yellow");
        List.add("Green");
        List.add("Red");
        int count = List.size();
        System.out.println("No. of elements = " + count);
        System.out.println(List);
        List.remove(2);
        List.remove("Blue");
        int count1 = List.size();
        System.out.println("No. of elements = " + count1);
        System.out.println(List);
    }
}
