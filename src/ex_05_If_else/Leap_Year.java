package ex_05_If_else;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Leap_Year
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the year");
        int y=sc.nextInt();
        if (y%400==0)
        {
            System.out.println("Entered year is leap year = " + y );
        }
        else if ( y % 100 ==0)
        {
            System.out.println("not a leap year");
        }
        else if(y % 4==0)
        {
            System.out.println("It is a leap year = " + y );
        }
   else {
            System.out.println("Not a leap year");
        }
   sc.close();
    }

}
