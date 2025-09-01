package OOPS_Class_objects;
class Animal {
    String color = "white";
    void eat()
    {
        System.out.println("eating....");
    }
}
class  dog extends Animal
{
    String color="black";
    void displaycolor()
    {
        System.out.println(super.color);
    }
    void eat()
    {
        System.out.println("eating bread.....");
        super.eat();
    }
}

