package ex_09_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Enter_the_value_for_arrays {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the value for position : " + i );
            a[i]=sc.nextInt();
        }
        System.out.println("Printing array elements...............");
        System.out.println(Arrays.toString(a));
    }
}
