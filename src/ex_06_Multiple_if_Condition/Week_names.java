package ex_06_Multiple_if_Condition;

import java.util.Scanner;

public class Week_names
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter tha week number");
        int day = sc.nextInt();
        if (day == 1) {
            System.out.println(" Sinday");
        }
            else if (day == 2) {
                System.out.println("Monday");
            } else if (day == 3) {
                System.out.println("Tuesday");
            } else if (day == 4) {
                System.out.println("Wednesday");
            } else if (day == 5) {
                System.out.println("Thursady");
            } else if (day == 6) {
                System.out.println("Friday");
            } else if (day == 7) {
                System.out.println("saturday");
            } else
                System.out.println(" invalid week number");

    sc.close();
    }

    }

