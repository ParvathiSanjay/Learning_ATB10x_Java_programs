package ex_04_ternary_operators;

public class Ternary_2
{
    public static void main(String[] args)
    {
        int a=2,b=4,c=2;
        int result= a>b ? ((a>c)? a:c): ((b>c)?b :c);
        System.out.println("largest number = " + result);
    }
}
