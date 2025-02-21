package ex_06_Multiple_if_Condition;

import java.util.Scanner;

public class Ass_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for a = ");
        int a = sc.nextInt();
        System.out.println(" enter the value for b =");
        int b=sc.nextInt();
                if (a>b)
                {
                    System.out.println("a is largest number");
                }
                else
                    System.out.println(" b is largest number");
     sc.close();
    }
}
