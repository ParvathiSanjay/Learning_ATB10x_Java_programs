package ex_05_If_else;

import java.util.Scanner;

public class Positive_negetive
{
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
       num= sc.nextInt();

        if( num >0)
        {
            System.out.println("Given number is positive = "+ num );
        }
        else
            System.out.println(" Given number is negetive = "+ num);
}
}
