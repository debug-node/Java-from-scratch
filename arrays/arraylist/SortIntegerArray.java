package arrays.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortIntegerArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(45);
        list.add(66);
        list.add(55);
        list.add(43);
        System.out.println("Before sorting : ");
        for (int marks : list) {
            System.out.println(marks);
        }
        Collections.sort(list);
        System.out.println("After sorting : ");
        for (int marks : list) {
            System.out.println(marks);
        }
    }
}
