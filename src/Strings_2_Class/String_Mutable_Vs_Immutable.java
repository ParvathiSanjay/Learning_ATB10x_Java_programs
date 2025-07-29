package Strings_2_Class;

import java.util.Arrays;

public class String_Mutable_Vs_Immutable {
    public static void main(String[] args) {
        /*String mutable
        int a[]={10,60,50,20,40,};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));// values are change in mutable
        //String immutable
        String s=new String("welcome");
        System.out.println(s);
        String concatString = s.concat(" to java");
        System.out.println(s);//welcome immutable cannot change the value
        System.out.println(concatString);



        // string immutable--> original values are not change
        String s= new String("welcome");
        s.concat("to java");
        System.out.println(s);



        //StringBuffer class --> mutable
        StringBuffer s=new StringBuffer("welcome");
        s.append(" to java");
        System.out.println(s);

         */
        //StringBuilder class--> mutable string-- original value will change
         StringBuilder s=new StringBuilder("welcome");
         s.append(" to java");
        System.out.println(s);


    }
}
