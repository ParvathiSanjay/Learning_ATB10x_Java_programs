package ex_09_arrays;

public class Object_arrays {
    public static void main(String[] args) {
        Object a[]= { 100,10.5,'A', "Apple is a fruit", true};


       /* for (int i=0; i<=a.length-1; i++)

        {
            System.out.println(a[i]);
        }

        */
        for (Object x : a)
        {
            System.out.println(x);
        }
    }
}
