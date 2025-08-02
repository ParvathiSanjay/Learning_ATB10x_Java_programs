package OOPS_Class_objects;

public class MainConstOver {
    public static void main(String[] args) {
        //BoxConstructorOverloading box=new BoxConstructorOverloading();//1
       //BoxConstructorOverloading box = new BoxConstructorOverloading(10.5,15.5,20.5);
        BoxConstructorOverloading box=new BoxConstructorOverloading(12.15);
        System.out.println(box.volume());
    }
}
