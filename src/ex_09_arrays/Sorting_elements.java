package ex_09_arrays;

import java.util.Arrays;

public class Sorting_elements {
    public static void main(String[] args) {
        int a[]={100,800,600,300,500};
        System.out.println("before sorting...");
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        System.out.println("after sorting");
        System.out.println(Arrays.toString(a));
    }
}
