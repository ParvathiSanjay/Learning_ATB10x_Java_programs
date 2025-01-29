package ex_05_If_else;

import java.util.Scanner;

public class Even_or_Odd
{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
      int  num= sc.nextInt();
      if ( num % 2 == 0)
      {
          System.out.println(" Given num is even" + num);
      }
      else
          System.out.println("Given num is odd" + num);
    }
}
