package ex_06_Multiple_if_Condition;

import java.util.Scanner;

public class Weeknum_switch_Case {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the weekday");
        String weekday= sc.next().toLowerCase();
        switch( weekday)
        {
            case"sunday": System.out.println(1); break;
            case"monday": System.out.println(2); break;
            case"tuesday": System.out.println(3); break;
            case"Wednesday": System.out.println(4); break;
            case"Thursday": System.out.println(5); break;
            case"Friday": System.out.println(6); break;
            case"Saturday": System.out.println(7); break;
            default: System.out.println(" invalid weekday");
        }
        sc.close();
    }
}
