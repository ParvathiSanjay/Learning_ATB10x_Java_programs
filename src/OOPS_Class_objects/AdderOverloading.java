package OOPS_Class_objects;

public class AdderOverloading {
    int a=10, b=20;
    void sum()// No parameters & method name is same
    {
        System.out.println(a+b);
    }

    /*int sum() //return type is not consider
    {
        return(a+b)
    }*/
    void sum(int x, int y)// number of parameters is different
    {
        System.out.println(x+y);
    }
    void sum(int x, double y)//parameters is different
    {
        System.out.println(x+y);
    }
    void sum(double x,int y)//order of parameterssss is different
    {
        System.out.println(x+y);
    }
    void sum(int a, int b,int c)//numbere of parameters are different
    {
        System.out.println(a+b+c);
    }
}
