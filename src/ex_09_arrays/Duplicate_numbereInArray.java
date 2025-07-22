package ex_09_arrays;

public class Duplicate_numbereInArray
{
    public static void main(String[] args) {
        int a[]={100,200,100,300,100,400,400,100};
        int num=400;
        int count=0;
        for( int value:a)
        {
           if(value==num)
           {
               count++;
           }

        }
        System.out.println( "duplicate number count = " + count );
    }
}
