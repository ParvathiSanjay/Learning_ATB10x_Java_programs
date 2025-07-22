package ex_09_arrays;

import java.util.Scanner;

public class Input_from_Keyboard {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        //int num = sc.nextInt();--------integer
        //Double num=sc.nextDouble();-----double
        String num= sc.next();
        System.out.println(num);
    }
}
