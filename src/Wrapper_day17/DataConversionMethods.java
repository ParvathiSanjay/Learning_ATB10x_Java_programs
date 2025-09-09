package Wrapper_day17;

public class DataConversionMethods {
    public static void main(String[] args) {
        //String-->int
      //  String s="welcome"; cannot convert to int
      /*  String s1="10";
        String s2="30";
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));  */
// String-->double
      /*  String s1="10.5";
        String s2="30";
        System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));*/


        // String--> Boolean
        String s1 ="selenium"; //other than "true" it wi return false
        System.out.println(Boolean.parseBoolean(s1));

        // int, double,char, boolean--------string

        int a = 10;
        double d=10.5;
        char c='d';
        boolean b=true;

        String s= String.valueOf(a);
        System.out.println(s);


        s=String.valueOf(c);
        System.out.println(s);


        s=String.valueOf(d);
        System.out.println(s);


        s=String.valueOf(b);
        System.out.println(s);
         }
}
