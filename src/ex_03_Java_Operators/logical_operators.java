package ex_03_Java_Operators;

public class logical_operators
{
    public static void main(String[] args) {
        boolean x=true;
        boolean y=false;

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!y);
        boolean b1=10>20;
        System.out.println(b1);
        boolean b2=20>10;
        System.out.println(b2);
        System.out.println(b1 && b2);
        System.out.println(b1||b2);
    }
}
