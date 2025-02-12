package ex_05_If_else;

import java.util.Scanner;

public class Smallest_of_Two_Numbers
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1= sc.nextInt();
        System.out.println("Enter the Second number");
        int num2= sc.nextInt();
        if (num1<num2)
        {
            System.out.println("num1 is small = " + num1 );
        }
        else
        {
            System.out.println("num2 is small" + num2 );
        }
    sc.close();
    }
}
