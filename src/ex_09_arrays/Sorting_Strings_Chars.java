package ex_09_arrays;

import java.util.Arrays;

public class Sorting_Strings_Chars {
    public static void main(String[] args) {
        String a[]={"King","Dog","Ant","Code"};
        System.out.println("Before sorting....");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting....");
        System.out.println(Arrays.toString(a));
    }
}
