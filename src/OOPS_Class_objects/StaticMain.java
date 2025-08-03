package OOPS_Class_objects;

public class StaticMain {
    public static void main(String[] args) {
        System.out.println(Staticdemo.a);
        Staticdemo.m1();
        //access the non static variable and method by creating object
        Staticdemo sd=new Staticdemo();
        System.out.println(sd.b);
        sd.m2();
        sd.m();
}}
