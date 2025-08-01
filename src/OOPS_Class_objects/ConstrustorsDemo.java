package OOPS_Class_objects;

public class ConstrustorsDemo {
    int x, y;

    ConstrustorsDemo() // Default constructor
    {
        x = 200;
        y = 100;
    }

    ConstrustorsDemo(int a, int b)//parameterized contructors
    {
        x = a;
        y = b;
    }

    void sum() {
        System.out.println(x + y);
    }


    public static void main(String[] args) {
       // ConstrustorsDemo cd = new ConstrustorsDemo();//Invoke default constructor
        ConstrustorsDemo cd=new ConstrustorsDemo(500,600);// parameterized constructor
        cd.sum();


    }
}
