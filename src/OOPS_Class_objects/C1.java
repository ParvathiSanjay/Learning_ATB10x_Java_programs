package OOPS_Class_objects;

public class C1 implements i1,i2 {
    @Override
    public void m1() {
        System.out.println(x);
    }

    @Override
    public void m2() {
        System.out.println(y);
    }

    public static void main(String[] args) {
        C1 c1obj=new C1();
        c1obj.m1();
        c1obj.m2();
    }
}
