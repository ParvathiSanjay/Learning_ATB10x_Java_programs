package ex_05_If_else;

import java.util.Scanner;

public class Person_is_Eligible_for_a_Loan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter the salary");
        float salary = sc.nextFloat();
        System.out.println(" Enter the credit score ");
        int score = sc.nextInt();
        /*if (age >= 18 && salary >= 30000 && score >= 650 && score <= 850)
        {
                System.out.println("eligible for take loan ");
        }*/
        if (age < 18 || age > 80) {
            System.out.println(" not eligible for load age must be greater than 18 and less than 80");
        } else if (salary < 30000) {
            System.out.println(" Not eligible for loan salary should be greater than 30000");
        } else if (score < 650 || score > 850) {
            System.out.println(" Not eligible for loan credit score should be greater than 650 and lesser than 850");
        } else {
            System.out.println(" Eligible to take loan");
        }
        sc.close();
    }
}


