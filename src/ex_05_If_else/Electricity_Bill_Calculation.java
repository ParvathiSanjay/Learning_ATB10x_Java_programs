package ex_05_If_else;

import java.util.Scanner;

public class Electricity_Bill_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the used electricity units");
        int units = sc.nextInt();
        double bill = 0;
        if (units <=100)
        {
            bill= units * 0.50;
        } else if (units<=200)
        {
        bill = (100 *0.50) + (units-100)*0.75 ;
        } else if ( units<=300) {
            bill= ((100 * 0.50 )+  (100 * 0.75)+ (units-200)*1.20);
        }
        else
            bill =( (100*0.50) +(100*0.75) + (100*1.20)+ ( units-300)*1.50);
        System.out.println(" bill amount= " + bill);
        /*{
            System.out.println("total electic bill =" + (uni * 0.50) );
        }
        else if ( unit <= 200 )
        {
            System.out.println(" total electic bill = " + (unit * 0.75));
        }
        else if( unit < 200 && unit < 300 )
        {
            System.out.println(" total electic bill = " + (unit * 1.20));
        }
else
            System.out.println(" total electic bill = " + (unit * 1.50) );*/
    sc.close();
    }
}
