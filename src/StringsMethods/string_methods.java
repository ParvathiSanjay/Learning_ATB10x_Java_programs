package StringsMethods;

import java.util.Arrays;
import java.util.Locale;

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
        System.out.println("before trimming " + sa.length());
        System.out.println(sa.trim());
        System.out.println("after trimming " + sa.trim().length());

        //charAt == returns a character from the string based on index
        //index starts from the Zero
        String s5="welcome";
        System.out.println(s5.charAt(3));//c
        System.out.println(s5.charAt(6));//e

        //contains== give/returns true or false
        System.out.println(s.contains("wel")); //true
        System.out.println(s.contains("come")); //true
        System.out.println(s.contains("Wel")); //false
        System.out.println(s.contains("COME")); //false
        System.out.println(s.contains("welme")); //false

        //equals() and equalsIgnoreCase

        s1="welcomeees";
        s2="welcomeees";
        System.out.println(s1==s2);//true
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals("welcomeees"));//true
        System.out.println(s1.equals("Welcomeees"));//false
        System.out.println(s1.equalsIgnoreCase("Welcomeees"));//true

        //replace() replace the single/multiple (sequence) of character in a string
        s="welcome to java selenium python selenium c# selenium";
        System.out.println(s.replace('e','X'));
        System.out.println(s.replace("selenium","playwrite"));

        //substring() extract substring from the  main string
        //starting index = 0
        //ending index = 1
        s= "selenium";
        System.out.println(s.substring(3,8));//enium
        System.out.println(s.substring(0,1));// s
        // toUppercase() & toLowerCase
        s="WeLcome";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        // split()=split the the string into multiple parts based on delimeters
        s="abc@gmail.com";

        String a[]=s.split("@");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(Arrays.toString(s.split("@")));
        //ex1
        String amount="$15,20,30";
        System.out.println(amount.replace("$",""));
        System.out.println(amount.replace("$","").replace(",",""));

    }
}
