package OOPS_Class_objects;
class Test
{
   final int x=100;
}

public class Final_Keyword {
    public static void main(String[] args) {
        Test t=new Test();
       // t.x=200;   // incorrect because x is a final variable
        System.out.println(t.x);
    }
}
