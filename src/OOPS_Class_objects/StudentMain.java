package OOPS_Class_objects;

public class StudentMain {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.sid=001;
        s1.sname="Smith";
        s1.grade='A';
        s1.printdata();

        Student s2=new Student();
        s2.sid=002;
        s2.sname="Smithaaa";
        s2.grade='B';
        s2.printdata();
    }
}
