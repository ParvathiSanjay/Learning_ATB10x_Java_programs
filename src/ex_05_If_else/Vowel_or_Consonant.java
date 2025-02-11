package ex_05_If_else;

import java.util.Scanner;

public class Vowel_or_Consonant
{
    public static void main(String[] args)
    {

Scanner sc= new Scanner(System.in);
        System.out.println("Enter a alphabet : ");
        char  lt;
       lt = sc.next().charAt(0);

           if (lt == 'a' || lt == 'e' || lt == 'i' || lt == 'o' || lt == 'u')
           {
               System.out.println("Entered character is vowel" + lt);
           } else
           {
               System.out.println("Entered character is consonant" + lt);
           }

    }
}
