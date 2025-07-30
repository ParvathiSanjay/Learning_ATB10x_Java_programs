package OOPS_Class_objects;

public class employeeMain {
    public static void main(String[] args) {
        employee emp1=new employee(); // object
        emp1.eid=101;
        emp1.ename="John";
        emp1.ejob="Manager";
        emp1.sal=50000;
        emp1.display();
        employee emp2=new employee();
        emp2.eid=102;
        emp2.ename="Jim";
        emp2.ejob="Engineer";
        emp2.sal=50000;
        emp2.display();
    }
}
