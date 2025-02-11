package ex_05_If_else;

import java.util.Scanner;

public class Maximum_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "enter 1st num");
        int num1= sc.nextInt();
        System.out.println( "enter 2nd num");
        int num2= sc.nextInt();
        if (num1>num2 && num1!=num2)
        {
            System.out.println("max num=" + num1);
        }

    else if (num2>num1 && num1!=num2) {
            System.out.println("max num=" + num2);
        }
    else
            System.out.println("num are equal");
    }
}
