package ex_06_Multiple_if_Condition;

import java.util.Scanner;

public class Smallest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a value =");
        int a=  sc.nextInt();

        System.out.println("enter b value ");
        int b= sc.nextInt();
        System.out.println("enter c value ");
        int c= sc.nextInt();
        if (a<b && a<c)
        {
            System.out.println( a + " a is smallest " );
        }
        else if (b<a && b<c)
        {
            System.out.println( b + " b is smallest ");
        }
        else
            System.out.println( c + " c is smallest");
        sc.close();
    }
}
