package ex_09_arrays;

public class Object_array
{
    public static void main(String[] args) {
        Object a[]={ 100,10.5,'a',"String",true };
       /*  for(Object x: a )
        {
            System.out.println(x);
        }*/
        for(int i=0;i<a.length-1;i++)
        {
            System.out.println(a[i]);
        }
    }
}
