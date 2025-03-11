package ex_08_assignment_on_loop_statements;

import java.util.Scanner;

public class Reverse_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num = sc.nextInt();
        int reversed = 0;
     while (num!=0)
     {
         int digit = num % 10;
         reversed = reversed * 10 + digit;
         num /= 10;
     }
        System.out.println("Revesed number= " + reversed );
     sc.close();



    }


}
