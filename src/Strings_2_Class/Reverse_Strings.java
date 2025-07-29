package Strings_2_Class;

public class Reverse_Strings {
    public static void main(String[] args) {

       //approach 1
        String s="welcome";
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println("reverse string is : " + rev);
        //approach 2
         String s1="Selenium";
         String rev1="";
         char a[]=s1.toCharArray();
         for(int i=a.length-1; i>=0;i--)
         {
             rev1=rev1+a[i];
         }
        System.out.println("Reverse string = " + rev1);

         //approach 3 StringBuilder class
        StringBuilder s6= new StringBuilder("welcomes");
        System.out.println(" reverse string = " + s6.reverse());

        // approach 4 StringBuffer class
        StringBuffer s7= new StringBuffer("parvathi");
        System.out.println("reverse sting = " + s7.reverse());
    }
}
