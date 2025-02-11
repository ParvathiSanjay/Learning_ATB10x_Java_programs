package ex_05_If_else;

import java.util.Scanner;

public class eligiable_to_Vote
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age= sc.nextInt();

        if (age>18)
        {
            System.out.println("Elegible to vote");
        }
        else
        {
            System.out.println("Not elegible to vote");
        }
    }
}
