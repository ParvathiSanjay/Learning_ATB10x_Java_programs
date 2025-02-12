package ex_05_If_else;

import java.util.Scanner;

public class Grade_Based_on_Marks
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the marks");
        int m = sc.nextInt();
        if (m<0 || m>100)
        {
            System.out.println( m + "not in the range between 0 to 100");


        }

else if (m >= 90 && m<=100)
        {
            System.out.println(m + " Grade A+");
        }
else if ( m>=80 && m<=89)
        {
            System.out.println( m +"Grade A");
        }
else if ( m>=70 && m<=79)
        {
            System.out.println(m + "Grade B");
        }
            else if( m>= 60 && m<=69)
        {
            System.out.println(m + " Grade C");
        }
            else if ( m>=50 && m<= 59)
        {
            System.out.println( m + " Grade D ");
        }
            else if( m>=40 && m<=49)
        {
            System.out.println( m + " Grade E ");

        }
            else
        {
            System.out.println(m + "Fail");
        }
sc.close();
    }
}
