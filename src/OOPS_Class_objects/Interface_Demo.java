package OOPS_Class_objects;
interface shape
{
    int length=10; //final & static
    int width=20;  //final & static

    void circle();  // Abstract method

    default void square()   //
    {
        System.out.println("this is a square");
    }

    static void rectangle()
    {
        System.out.println(" this is a rectangle ");
    }

}

public class Interface_Demo implements shape{
    public void circle()
    {
        System.out.println("this ia a circle - abstract method");
    }
     void triangle()
     {
         System.out.println(" This is a triangle ...");
     }
    int x=100,y=200;
    public static void main(String[] args) {

       //scenario -1
        Interface_Demo idobj=new Interface_Demo();
                idobj.circle();// abstract
                idobj.square();// default
                shape.rectangle();// static method can directly access from interface
idobj.triangle();
        System.out.println(idobj.x + idobj.y);


        //scenario -2
       shape sh =new Interface_Demo();
       sh.circle();// abstract
       sh.square();// default
       shape.rectangle(); // static method can directly access from interface
        // sh.triangle(); we cannot access
        System.out.println(shape.length * shape.width);// accessing static variable directly
      //  System.out.println(sh.x + sh.y);// we cannot access


    }
}
