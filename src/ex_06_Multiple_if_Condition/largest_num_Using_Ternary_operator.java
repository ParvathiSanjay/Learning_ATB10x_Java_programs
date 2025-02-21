package ex_06_Multiple_if_Condition;

import java.util.Scanner;

public class largest_num_Using_Ternary_operator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter tha a value");
        int a = sc.nextInt();
        System.out.println("enter the b value");
        int b= sc.nextInt();

        int result= (a>b)? a: b;
        System.out.println("largest number ="+ result);
        sc.close();
    }
}
