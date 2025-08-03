package OOPS_Class_objects;

public class Staticdemo {
    static int a=20;  // static variable
    int b=30;  //non static variable
    static void m1()   //static method
    {
        System.out.println(" this ia static m1 method....");
    }

    void m2()  // non static method
    {
        System.out.println(" this is no static m2 method...");
    }
    void m()
    {
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }
   /* public static void main(String[] args) {
        //System.out.println(a);
        //m1();
        // access the non static variable and method by creating object
        Staticdemo sd=new Staticdemo();
        //System.out.println(sd.b);
        //sd.m2();
        sd.m();

    }*/
}
