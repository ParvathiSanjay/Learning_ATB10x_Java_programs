package ex_04_ternary_operators;

public class Assignment_19_jan_Ternary
{
    public static void main(String[] args) {
        int a=40, b=50, c=20;
       int largest = (a>=b)? ((a>=c)?a:c) : ((b>=c)?b:c );
        System.out.println("largest number="+largest);
    }
}
