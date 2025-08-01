package OOPS_Class_objects;

public class Stud {
    int sid;
    String sname;
    char grad;

    void prindstud() {
        System.out.println(sid + "  " + sname + "  " + grad);
    }

    void setStud(int id, String name, char gr) {
        sid = id;
        sname = name;
        grad = gr;
    }

    Stud(int id, String name, char gr)
    {
        sid = id;
        sname = name;
        grad = gr;
    }


}
