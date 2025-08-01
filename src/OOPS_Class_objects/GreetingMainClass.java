package OOPS_Class_objects;

public class GreetingMainClass {
    public static void main(String[] args) {
        Greeting gr=new Greeting();
        gr.m1();//  1
        String s=gr.m2();// 2
        System.out.println(s);
        gr.m3("John"); //  3
        String var= gr.m4("Merry"); //4
        System.out.println(var);

    }
}
