package StringsMethods;

public class string_methods {
    public static void main(String[] args) {
      //  String s="welcome";
        //String s= new String("welcomw");
        //System.out.println(s);
        //length()---returns length of strings
        String s="welcome";
        s.length();
        System.out.println(s.length());
        System.out.println("tiger".length());

        //concat---joining strings
        String s1="welcome";
        String s2=" to java";
        String s3=" Automation";
        String s4=" learning";
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1.concat(s2).concat(s3).concat(s4));

        //trim==remove the right and left spaces
        String sa="   welcomess   ";
        System.out.println(sa);
        System.out.println(sa.trim());



    }
}
