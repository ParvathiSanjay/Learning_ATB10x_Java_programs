package OOPS_Class_objects;


    class A {
        int a ;

        void display() {
            System.out.println(a);
        }
    }

    class B extends A {
        int b ;

        void show() {
            System.out.println(b);
        }
    }
    class C extends B{
        int c;
        void print(){
            System.out.println(c);
        }
    }
    public class Inheritance {
    public static void main(String[] args) {
       /* B bobj=new B();
        System.out.println(bobj.a);
        System.out.println(bobj.b);
        bobj.show();
        bobj.display();*/
        C cobjc= new C();
        cobjc.c=100;
        cobjc.b=200;
        cobjc.a=300;


        cobjc.display();
        cobjc.show();
        cobjc.print();
    }
}
