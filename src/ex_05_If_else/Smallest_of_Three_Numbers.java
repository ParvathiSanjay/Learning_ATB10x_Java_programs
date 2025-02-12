package ex_05_If_else;

import java.util.Scanner;

public class Smallest_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st number ");
        int a =sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter the 3rd number");
        int c= sc.nextInt();
        if (a<b && b<c)
        {
            System.out.println("a is the smallest number = " + a );
        }
        else if (b<a && b<c)
        {
            System.out.println("b is the smallest number = " + b );

        }
        else
        {
            System.out.println("c is the smallest number = " + c );
        }
        sc.close();
    }

}
