package ex_04_ternary_operators;

public class Ternary_max_4
{
    public static void main(String[] args) {
        int  p= 60, q=100, r=110,s=200 ;
       // int Max_num = num1 > num2 ? (num1 > num3 ?  num1 > num4 ? num1 : num4 : num3) : ( num1 > num4 ? num1 : num4): ( num2 > num3 ? num2 : num3 )num3 > num4 ? num3: num4 );
          int Res = p >q ? p > r ? p > s ? p: s : r : q >r ? q > s? q:s : r>s? r: s;



        System.out.println( "Max_num =" + Res );


    }
}
